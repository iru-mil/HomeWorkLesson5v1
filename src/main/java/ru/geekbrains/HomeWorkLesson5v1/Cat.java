package ru.geekbrains.HomeWorkLesson5v1;

public class Cat extends Animal {
    static int countCat;
    static int extremeRun = 200;

    public void setName(String name) {
        super.name = name;
        countCat++;
    }

    @Override
    public void run(int length) {
        if (length > 0 && length < extremeRun)
            System.out.println("Кот " + name + " пробежал " + length + " м");
        else if (length > extremeRun)
            System.out.println("Кот " + name + " не может бежать больше " + extremeRun + " м");
        else System.out.println("Неверно задана дистанция");
    }

    public void swim() {
        System.out.println("Кот " + name + " как и все коты не умеет плавать ");
    }
}
