package OOP;

import java.util.Scanner;

public class Person {
    private int id;
    private String name;
    private int age;


    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "id= " + id + ", " + "name= " + name + ", " + "age=" + age + '}';
    }


    public void input(Person person) {
        System.out.println("Mời nhập thông tin");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập thông tin ID: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Mời nhập tên : ");
        name = scanner.nextLine();

        System.out.println("Mời nhập tuổi: ");
        age = scanner.nextInt();
    }
}
