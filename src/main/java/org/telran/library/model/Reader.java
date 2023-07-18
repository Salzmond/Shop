package org.telran.library.model;

public class Reader {

    private String name;
    private String surname;
    private String login;

    //as string is bad idea
    private String password;
    private int age;

    public Reader(String name, String surname, String login, String password, int age) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", login='" + login + '\'' +
                ", age=" + age +
                '}';
    }
}
