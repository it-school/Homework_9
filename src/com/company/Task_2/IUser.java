package com.company.Task_2;

public interface IUser {
    void setId(int id);
    int getId();
    void setLogin(String login);
    String getLogin();
    void setPassword(String password);
    int getPasswordHash();
    void setFullName(String fullName);
    String getFullName();
    String toString();
}
