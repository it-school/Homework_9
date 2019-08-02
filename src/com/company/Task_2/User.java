package com.company.Task_2;

public class User implements IUser {
    private int id;
    private String login;
    private int passwordHash;
    private String fullName;

    public User(int id, String login, String password, String fullName) {
        this.id = id;
        this.setLogin(login);
        this.setPassword(password);
        this.fullName = fullName;
    }

    @Override
    public void setId(int id) {
        this.id=id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setLogin(String login) {
        this.login=(login.trim()).toLowerCase();
    }

    @Override
    public String getLogin() {
        return login;
    }

    @Override
    public void setPassword(String password) {
        this.passwordHash=password.hashCode();
    }

    @Override
    public int getPasswordHash() {
        return passwordHash;
    }

    @Override
    public void setFullName(String fullName) {
        this.fullName=fullName;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return  "\tID " + id +
                "\tLogin: " + login +
                "\tPassword_Hash: " + passwordHash +
                "\tFull_Name: " + fullName+"\n";
    }
}
