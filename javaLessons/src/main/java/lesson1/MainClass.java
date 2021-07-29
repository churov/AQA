package src.main.java.lesson1;

public class MainClass {
    public static void main(String[] args) {
        Сотрудник сотрудник1 = new Сотрудник("Моисеев", "Гомосек", "churov@tut.by", "77655777", 67755, 31);
        Сотрудник сотрудник2 = new Сотрудник("Эрика", "Красный", "churovaa@yandex.by", "554664", 675567, 34);
        System.out.println("Кот1 имя: " + сотрудник1.fio + " цвет: " + сотрудник1.post + сотрудник1.email+ сотрудник1.phone+ сотрудник1.salary+ сотрудник1.age);
        System.out.println("Кот2 имя: " + сотрудник2.fio + " цвет: " + сотрудник2.post + сотрудник2.email+ сотрудник2.phone+ сотрудник2.salary+ сотрудник2.age);
    }
}