package scanner.dto;

public class Customer {
    // must used be without any space
    private String name;
    private int age;
    private int day;

    public Customer(String name, int age, int day) {
        this.name = name;
        this.age = age;
        this.day = day;
    }

    // Getter setter and constructor with args
    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}