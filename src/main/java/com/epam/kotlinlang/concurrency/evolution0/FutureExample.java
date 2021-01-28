package com.epam.kotlinlang.concurrency.evolution0;

import com.epam.kotlinlang.coroutines.util.Account;
import com.epam.kotlinlang.coroutines.util.Service;
import com.epam.kotlinlang.coroutines.util.User;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.epam.kotlinlang.coroutines.util.MiscKt.printTime;

public class FutureExample {

    private static final Service service = new Service();

    public static void main(String[] args) {
        CompletableFuture<User> future = CompletableFuture.supplyAsync(() -> 1)
                .thenApplyAsync(service::findUser);

        CompletableFuture<Account> accountCompletableFuture = future.thenApplyAsync((User user) -> service.findAccount(user.getAccId()));
        CompletableFuture<List<String>> listCompletableFuture = future.thenApplyAsync((User user) -> service.findPermissions(user.getId()));

        CompletableFuture<Void> parallelFuture = CompletableFuture.allOf(
                accountCompletableFuture,
                listCompletableFuture
        )
                .thenRunAsync(() -> 
                        service.transferMoney(accountCompletableFuture.getNow(null).getBalance(), 
                                listCompletableFuture.getNow(null))
                )
                .exceptionally(throwable -> {
                    service.rollback(throwable);
                    return null;
                });

        parallelFuture.join(); // Wait for completion
    }
}
