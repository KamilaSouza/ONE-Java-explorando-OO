package br.com.bytebank.bank.model;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        // ArrayList list = new ArrayList(); accept all
        ArrayList<Account> list = new ArrayList<Account>(); // only Accounts accepted

        Account cc = new CurrentAccount(22, 11);
        list.add(cc);

        Account cc2 = new CurrentAccount(33, 22);
        list.add(cc2);

        Account cc3 = new CurrentAccount(33, 22);

        System.out.println(list.size());

        boolean exists = list.contains(cc3);

        System.out.println(exists);

//        for (int i = 0; i < list.size(); i++) {
//            Object o = list.get(i);
//            System.out.println(o);
//        }

        for (Account account : list) {
            System.out.println(account);
        }

        for (Account account : list) {
            if (account == cc2) {
                System.out.println("Already Registered");
            }
        }
    }
}
