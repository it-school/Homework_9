package com.company.Task_2;

public interface IDataBase {
    void addUser(String login,String password, String fullName);
    void removeUser(int id);
    String toString();
    void clearOut();
}
