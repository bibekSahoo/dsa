package Inheritance.abstracttry;

public abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    abstract void login();
}
