package com.uu.entity;

/**
 * @Author: Ecopan
 * @Description:
 * @Date: Created in 17:50 2018-02-07
 * @Modified By:
 */
public class User {
    private int id;
    private String account;
    private String password;
    private String userName;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", palyFrequency='" + palyFrequency + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPalyFrequency() {
        return palyFrequency;
    }

    public void setPalyFrequency(String palyFrequency) {
        this.palyFrequency = palyFrequency;
    }

    private String palyFrequency;
}
