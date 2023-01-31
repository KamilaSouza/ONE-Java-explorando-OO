package br.com.bytebank.bank.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayLists {

    public static void main(String[] args) {
        // ArrayList list = new ArrayList(); accept all
        ArrayList<Account> list = new ArrayList<>(); // only Accounts accepted

        Account sc1 = new SavingsAccount(2, 22);
        Client c1 = new Client();
        c1.setName("Nico");
        sc1.setOwner(c1);
        sc1.deposit(100);

        Account cc1 = new CurrentAccount(4, 44);
        Client c2 = new Client();
        c2.setName("Kami");
        cc1.setOwner(c2);
        cc1.deposit(200);

        Account sc2 = new SavingsAccount(1, 11);
        Client c3 = new Client();
        c3.setName("May");
        sc2.setOwner(c3);
        sc2.deposit(150);

        Account cc2 = new CurrentAccount(5, 55);
        Client c4 = new Client();
        c4.setName("Pedro");
        cc2.setOwner(c4);
        cc2.deposit(50);

        list.add(sc1);
        list.add(sc2);
        list.add(cc1);
        list.add(cc2);


        list.sort((o1, o2) -> Integer.compare(o1.getNumber(), o2.getNumber()));

        Comparator<Account> stringComparator = (Account o1, Account o2) -> {
            String nameO1 = o1.getOwner().getName();
            String nameO2 = o2.getOwner().getName();
            return nameO1.compareTo(nameO2);
        };

        list.sort(stringComparator);

        list.forEach((account) -> System.out.println(account + " , " + account.getOwner().getName() + " , " + account.getBalance()));

        //list.sort(new AccountNumberComparator());

        //Collections.sort(list, new AccountNumberComparator());
        //Collections.reverse(list);
        //Collections.sort(list); // is necessary a comparable in class


//        for option 1:
//        for (Account account : list) {
//            System.out.println(account + " , " + account.getOwner().getName() + " , " + account.getBalance());
//        }


//        for option 2:
//        for (int i = 0; i < list.size(); i++) {
//            Object o = list.get(i);
//            System.out.println(o);
//        }

    }
}
