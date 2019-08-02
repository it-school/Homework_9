package com.company;

import com.company.Task_2.DataBase;

public class Main {

    public static void main(String[] args) {
        DataBase Pupils = new DataBase();
        Pupils.addUser("rgeerg","wegrwg","wergweg");
        Pupils.addUser("vasil","vaergdfil","vasil");
        Pupils.addUser("vadfgil","vasil","vadfgil");
        Pupils.addUser("vsdfgil","vadfgsil","dfgsil");
        Pupils.addUser("ergasil","vasil","vadfgil");
        Pupils.addUser("vadfgsil","vasdfgil","vasil");
        Pupils.addUser("vasil","vasil","vasil");
        Pupils.addUser("vasergil","vaergsil","vdfgsil");
        Pupils.addUser("vasil","vafsil","vasil");
        Pupils.addUser("todelete","todelete","todelete");
        Pupils.addUser("vasil","vasfil","vasil");
        Pupils.addUser("dfgsil","vdffgsil","vasil");
        System.out.println(Pupils.toString());
        Pupils.removeUser(10);
        System.out.println(Pupils.toString());
        Pupils.clearOut();
        System.out.println(Pupils.toString());
    }
}
