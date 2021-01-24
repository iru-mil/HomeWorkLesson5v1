package ru.geekbrains.HomeWorkLesson5v1;

public class Dog extends Animal {
    static int countDog;
    static int extremeRun = 500;
    static int extremeSwim = 10;

    public void setName(String name) {
        super.name = name;
        countDog++;
    }

    @Override
    public void run(int length) {
        if (length > 0 && length < extremeRun)
            System.out.println("Собака " + name + " пробежал " + length + " м");
        else if (length >= extremeRun)
            System.out.println("Собака " + name + " не может бежать больше " + extremeRun + " м");
        else System.out.println("Неверно задана дистанция");
    }

    public void swim(int length) {
        if (length > 0 && length < extremeSwim)
            System.out.println("Собака " + name + " проплыл " + length + " м");
        else if (length > extremeSwim)
            System.out.println("Собака " + name + " не может проплыть больше " + extremeSwim + " м");
        else System.out.println("Неверно задана дистанция");
    }
}
