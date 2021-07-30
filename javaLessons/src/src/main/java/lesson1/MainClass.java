package src.main.java.lesson1;

public class MainClass {
    public static void main(String[] args) {
        Employee[]employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов И.И.", "дворник", "post1@mail.ru", "80232456521", 450, 45);
        employeeArray[1] = new Employee("Петров П.П.", "бухгалтер", "post2@tut.by", "80232456522", 900, 44);
        employeeArray[2] = new Employee("Сидоров С.С.", "охранник", "post3@yandex.ru", "80232456523", 550, 35);
        employeeArray[3] = new Employee("Степанов С.С.", "инженер", "post4@mail.ru", "80232456524", 1100, 45);
        employeeArray[4] = new Employee("Дмитриев Д.Д.", "директор", "post5@tut.by", "80232456525", 1600, 50);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 29) {
                employeeArray[i].print();
            }
        }
    }
}