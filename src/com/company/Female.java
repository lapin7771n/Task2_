package com.company;

import java.util.Random;
import java.util.Scanner;

public class Female extends Human {
    public Female(boolean gender, String name, String surname, float height, float weight) {
        super(false, name, surname, height, weight);
    }

    public Human GiveABirth(Male male) {
        int i = new Random().nextInt(2);
        if (i == 0) {
            System.out.println("Мальчик.\nВведите имя: ");
            String name = new Scanner(System.in).nextLine();
            String surname = male.getSurname();
            float height = (float) (male.getHeight() + (0.1 * male.getHeight()));
            float weight = (float) (male.getWeight() + (0.1 * male.getWeight() - this.getHeight()));
            return new Male(true, name, surname, height, weight);
        } else {
            System.out.println("Девочка.\nВведите имя: ");
            String name = new Scanner(System.in).nextLine();
            String surname = male.getSurname();
            float height = (float) (male.getHeight() + (0.1 * male.getHeight()));
            float weight = (float) (male.getWeight() + (0.1 * male.getWeight() - this.getHeight()));
            return new Male(true, name, surname, height, weight);
        }
    }
}
