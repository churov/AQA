package main.java.lessons;

class Cat extends Animal
{
    private final int MAX_RUN_LENGTH = 200;
    private final int MAX_SWIM_LENGTH = 0;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
        else System.out.println("Кот пробежал "+MAX_RUN_LENGTH+" метров");
    }

    @Override
    void swim(int length) {
        System.out.println("Кот проплыл "+MAX_SWIM_LENGTH+" метров");
    }


}