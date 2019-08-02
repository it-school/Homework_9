package com.company.Task_2;


public class DataBase implements IDataBase {
    private User[] users = new User[0];
    private int id = 0;

    @Override
    public void addUser(String login, String password, String fullName) {
        this.id++;
        User[] temp = new User[this.id];
        for (int i = 0; i < this.users.length; i++) {
            temp[i] = this.users[i];
        }
        temp[(id - 1)] = new User(id, login, password, fullName);
        this.users = temp;
    }

    @Override
    public void removeUser(int id) {
        if (id < users.length) {
            for (; id < users.length; id++) {
               users[id-1]=users[id];
                }
            }
        this.id--;
        User[] temp = new User[this.id];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = this.users[i];
        }
        this.users = temp;
        }




    @Override
    public void clearOut() {
        this.users = new User[0];
    }

    @Override
    public String toString() {
        String userstable = "";
        for (int id = 0; id < users.length; id++) {
            userstable += "\n" + users[id].toString();
        }
        return userstable;
    }
}
