package com.epam.kotlinlang.concurrency.evolution1;

import com.epam.kotlinlang.coroutines.util.Service;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

class ReactorExample {

    private static final Service service = new Service();

    public static void main(String[] args) {
        Mono.just(1)
                .map(service::findUser)
                .flatMap(user ->
                        Mono.zip(
                                Mono.fromCallable(() -> service.findAccount(user.getAccId())).subscribeOn(Schedulers.boundedElastic()),
                                Mono.fromCallable(() -> service.findPermissions(user.getId())).subscribeOn(Schedulers.boundedElastic())
                        )
                )
                .doOnNext(tuple -> service.transferMoney(tuple.getT1().getBalance(), tuple.getT2()))
                .onErrorResume(e -> Mono.fromCallable(() -> {
                        service.rollback(e);
                        return null;
                    }))
                .block();
    }
}
