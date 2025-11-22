package bai2.service;


import bai2.constant.SuccessMessage;
import bai2.main.Main;
import bai2.constant.Common;
import bai2.constant.ErrorMessage;
import bai2.model.Animal;

import java.util.ArrayList;

import static bai2.main.Main.animals;

public class ZooService {
//    private static ArrayList<Animal> animals = new ArrayList<Animal>();

    public ZooService() {
    }

//    public static ArrayList<Animal> getAnimals() {
//        return animals;
//    }

//    public static void setAnimals(ArrayList<Animal> animals) {
//        ZooService.animals = animals;
//    }
    public void addAnimal(Animal a){
        if (a.getAge() <= 0 || a.getName().isEmpty()) {
            System.out.println(ErrorMessage.ERROR_INVALID_INFORMATION);
//            return;
        }
        else {
            animals.add(a);
            System.out.println(SuccessMessage.SUCCESS_ENTER_NEW_ANIMAL);
        }
    }

    public void showAllAnimals (){
        for (Animal a : animals){
            a.showInfo();
            a.makeSound();
        }
    }

    public void findAnimalByName(String name){
        for (Animal a : animals){
            if (a.getName().equals(name)){
                a.showInfo();
                System.out.printf(Common.SHOW_FIND_BY_NAME + name);
                return;
            }
        }
        System.out.printf(ErrorMessage.ERROR_ANIMAL_NOT_FOUND + name);
    }
    public void over10Age(){
        ArrayList<Animal> ans = new ArrayList<>();
        int count = 0;
        for (Animal a : animals){
            if (a.getAge() >= 10){
                ans.add(a);
                count++;
            }
        }
        if (ans.isEmpty()){
            System.out.printf(ErrorMessage.ERROR_ANIMAL_NOT_FOUND_BY_AGE + 10);
        }
        else {
            for (Animal a : ans){
                a.showInfo();
            }
        }

    }
}
