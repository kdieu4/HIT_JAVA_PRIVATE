package BTTL.service.impl;

import BTTL.model.*;
import BTTL.service.IAnimalService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IAnimalServiceImpl implements IAnimalService {

    @Override
    public List<Animal> animalsSwimmable(List<Animal> animals) {
        List<Animal> animalSwimmableList = new ArrayList<>();
        for (Animal animal:animals){
            if (animal.swim()){
                animalSwimmableList.add(animal);
            }
        }
        return animalSwimmableList;
    }

    @Override
    public List<Animal> animalFlyable(List<Animal> animals) {
        List<Animal> animalFlyableList = new ArrayList<>();
        for (Animal animal:animals){
            if (animal.fly()){
                animalFlyableList.add(animal);
            }
        }
//        return List.of();
        return animalFlyableList;
    }

    @Override
    public boolean deleteAnimalSwimmable(List<Animal> animals) {
        animals.removeIf(Animal::swim);
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()){
            Animal animal = iterator.next();
            if (animal.swim()){
                iterator.remove();
            }
        }
        return true;
    }

    @Override
    public boolean deleteAnimalSwimmableAndFlyable(List<Animal> animals) {
        for(int i = animals.size()-1;i>=0;i--){
            if (animals.get(i).swim() && animals.get(i).fly()){
                animals.remove(i);
            }
        }
        return true;
    }
}
