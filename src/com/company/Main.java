package com.company;

import java.lang.reflect.Type;
import java.util.Scanner;

public class Main {

    public static Human human1;
    public static Human human2;

    public static void main(String[] args) {
        human1 = values(human1);
        human2 = values(human2);

        if (human1.Speak(human2))
            System.out.println(human1.getName() + " с удовольствием поговорит с " + human2.getName());
        else System.out.println("Разговор " + human1.getName() + " c " + human2.getName() + " не удался");

        if (human1.BeInSociety(human2))
            System.out.println(human1.getName() + " может находиться с " + human2.getName() + " в одном помещении.");
        else System.out.println("Врядли " + human1.getName() + " захочет быть в одной компании с " + human2.getName());

        if (human1.BeTogether(human2)) {
            System.out.println(human1.getName() + " не против встречаться с " + human2.getName());
            Human human3 = human1.HaveRelations(human2);
            if (human3 != null) {
                System.out.println("Отношения между " + human1.getName() + " и " + human2.getName() + " привели к появлению: " + human3.getName());
                System.out.println(human3.toString());
            }
        } else System.out.println(human1.getName() + " не подходит " + human2.getName() + " по гороскопу.");

    }

    private static Human values(Human human) {
        Male male;
        Female female;
        System.out.println("Введите пол (М/ж): ");
        String gender = new Scanner(System.in).nextLine();
        if (gender.isEmpty()) {
            System.out.println("Вы не ввели пол!");
            values(human);
        }
        else if(!gender.equalsIgnoreCase("м") && !gender.equalsIgnoreCase("ж")) {
            values(human);
        }
        System.out.println("Введите имя: ");
        String name = (new Scanner(System.in).nextLine());
        System.out.println("Введите фамилию: ");
        String surname = (new Scanner(System.in).nextLine());
        System.out.println("Введите рост: ");
        float height = (new Scanner(System.in).nextFloat());
        System.out.println("Введите вес: ");
        float weight = (new Scanner(System.in).nextFloat());

        if (gender.equalsIgnoreCase("м")) {
            male = new Male(true, name, surname, height, weight);
            return male;
        } else if (gender.equalsIgnoreCase("ж")) {
            female = new Female(false, name, surname, height, weight);
            return female;
        }
        return human;
    }
}
