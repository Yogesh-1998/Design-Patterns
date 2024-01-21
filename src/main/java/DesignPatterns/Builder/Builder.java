package DesignPatterns.Builder;

public class Builder {
    public static void main(String[] args) {
        System.out.println(Employee.builder().age(12).build().toString());
    }
}
