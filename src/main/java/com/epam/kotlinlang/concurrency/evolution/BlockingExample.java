package com.epam.kotlinlang.concurrency.evolution;

import com.epam.kotlinlang.coroutines.util.Account;
import com.epam.kotlinlang.coroutines.util.Service;
import com.epam.kotlinlang.coroutines.util.User;

import java.util.List;

public class BlockingExample {

    private static final Service service = new Service();

    public static void main(String[] args) {
        User user = service.findUser(1);

        Account account = service.findAccount(user.getAccId());
        List<String> permissions = service.findPermissions(user.getId());

        try {
            service.transferMoney(account.getBalance(), permissions);
        } catch (Exception e) {
            service.rollback(e);
        }
    }
}
