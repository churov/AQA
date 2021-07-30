package src.main.java.lesson1;

public class Employee {
    public String name;
    public String post;
    public String email;
    public String phone;
    public long salary;
    public int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String post, String email, String phone, long salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("Имя: " + name + ", " + " Должность: " + post + ", " + " e-mail: " + email + ", " +
                " Тел.: " + phone + ", " + " ЗП: " + salary + ", " + " Возраст: " + age);

    }
}