package model;

public class HelloModel {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return "Xin chào, " + name + "!";
    }
}