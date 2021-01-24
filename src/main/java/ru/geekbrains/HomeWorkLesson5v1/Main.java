package ru.geekbrains.HomeWorkLesson5v1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Васька");
        Cat cat2 = new Cat();
        cat2.setName("Пушок");
        Cat cat3 = new Cat();
        cat3.setName("Рыжик");
        Cat cat4 = new Cat();
        cat4.setName("Матроскин");
        Dog dog1 = new Dog();
        dog1.setName("Джек");
        Dog dog2 = new Dog();
        dog2.setName("Вольт");
        Dog dog3 = new Dog();
        dog3.setName("Бим");

        System.out.print("В гонке участвет " + (Dog.countDog + Cat.countCat) + " животных, в том числе: ");
        System.out.print("собак - " + Dog.countDog);
        System.out.println(", котов - " + Cat.countCat);


        dog1.run(150);
        dog2.run(600);
        dog2.run(-2);
        dog2.run(200);
        dog3.run(250);
        dog1.swim(5);
        dog2.swim(11);
        dog3.swim(0);
        dog3.swim(6);

        cat1.run(100);
        cat2.run(250);
        cat3.run(150);
        cat4.run(0);
        cat1.swim();
        cat4.swim();
    }
}
