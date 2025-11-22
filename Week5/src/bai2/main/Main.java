package bai2.main;

import bai2.constant.Common;
import bai2.constant.ErrorMessage;
import bai2.constant.SuccessMessage;
import bai2.model.Animal;
import bai2.model.Elephant;
import bai2.model.Lion;
import bai2.model.Monkey;
import bai2.service.ZooService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final ArrayList<Animal> animals = new ArrayList<>();
    public static final ArrayList<String> typeOfAnimals = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        typeOfAnimals.add("lion");
        typeOfAnimals.add("monkey");
        typeOfAnimals.add("elephant");
        ZooService zooService = new ZooService();
        animals.add(new Lion("Lily", 15, 20.0));
        animals.add(new Elephant("Ellie", 10, 10.0));
        animals.add(new Monkey("Mini", 7, "Banana"));

        boolean isContinue = true;
        while (isContinue) {
            System.out.println(Common.Menu.MENU);
            int choice = 0;
            try {
                System.out.println(Common.ENTER_CHOICE);
                choice = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println(ErrorMessage.ERROR_INVALID_CHOICE + e.getMessage());
            }
            switch (choice) {
                case 1:
                    boolean isEnter = true;
                    while (isEnter) {
                        System.out.println(Common.ENTER_TYPE_OF_ANIMAL);
                        String type = scanner.nextLine();
                        if (!typeOfAnimals.contains(type)) {
                            continue;
                        }
                        System.out.println(Common.ENTER_NAME);
                        String name = scanner.nextLine();
                        System.out.println(Common.ENTER_AGE);
                        int age = 0;
                        try {
                            age = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println(ErrorMessage.ERROR_FORMAT + e.getMessage());
                            continue;
                        }
//                        final String type1 = typeOfAnimals.get(1);
                        switch (type.toLowerCase()) {
                            case "lion":
                                System.out.println(Common.ENTER_WEIGHT);
                                double weight = 0;
                                try {
                                    weight = Double.parseDouble(scanner.nextLine());
                                    animals.add(new Lion(name, age, weight));
                                } catch (NumberFormatException e) {
                                    System.out.println(ErrorMessage.ERROR_FORMAT + e.getMessage());
                                }
                                break;
                            case "elephant":
                                System.out.println(Common.ENTER_LENGTH);
                                double length = 0;
                                try {
                                    length = Double.parseDouble(scanner.nextLine());
                                    animals.add(new Elephant(name, age, length));
                                } catch (NumberFormatException e) {
                                    System.out.println(ErrorMessage.ERROR_FORMAT + e.getMessage());
                                }
                                break;
                            case "monkey":
                                System.out.println(Common.ENTER_FRUIT);
                                String fruit = scanner.nextLine();
                                if (fruit.isEmpty()) {
                                    continue;
                                }
                                else {
                                    animals.add(new Monkey(name, age, fruit));
                                }
                            default:
                                System.out.println(ErrorMessage.ERROR_INVALID_TYPE);
                        }
                        System.out.println(Common.ENTER_IS_CONTINUE);
                        String ans =  scanner.nextLine();
                        if (!ans.equalsIgnoreCase("y")){
                            isEnter = false;
                        }
                    }
                    break;
                case 2:
                    zooService.showAllAnimals();
                    break;
                case 3:
                    System.out.println(Common.ENTER_NAME_TO_FIND);
                    String nameToFind = scanner.nextLine();
                    zooService.findAnimalByName(nameToFind);
                    break;
                case 4:
                    zooService.over10Age();
                    break;
                case 5:
                    System.out.println(SuccessMessage.SUCCESS_EXIT);
                    isContinue = false;
                    break;
                default:
                    System.out.println(ErrorMessage.ERROR_INVALID_CHOICE);
            }
        }
    }
}
