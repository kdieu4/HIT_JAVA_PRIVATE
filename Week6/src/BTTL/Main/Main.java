package BTTL.Main;

import BTTL.constant.Common;
import BTTL.model.Animal;
import BTTL.model.Bird;
import BTTL.model.Cat;
import BTTL.model.Dog;
import BTTL.service.impl.IAnimalServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Animal> animals = new ArrayList<Animal>();
    public static void main(String[] args) {
        animals.add(new Dog("Ki", 15));
        animals.add(new Cat("Meo", 5));
        animals.add(new Bird("Peter", 3));
        animals.add(new Dog("Cao", 10));
        animals.add(new Cat("Meo", 10));

        Scanner scanner = new Scanner(System.in);
        IAnimalServiceImpl animalService = new IAnimalServiceImpl();

//        System.out.println(animalService.animalsSwimmable(animals));
//        System.out.println(animalService.animalFlyable(animals));
        if (animalService.deleteAnimalSwimmableAndFlyable(animals)) {
            System.out.println(animals);
        }
    }
}
