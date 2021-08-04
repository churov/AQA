package main.java.lessons;

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;


    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Пес пробежал "+MAX_RUN_LENGTH+" метров");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("Пес проплыл "+MAX_SWIM_LENGTH+" метров");
        else System.out.println("Пес утонул ");
    }


}