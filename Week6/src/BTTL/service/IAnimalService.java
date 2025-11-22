package BTTL.service;

import BTTL.model.Animal;

import java.util.List;

public interface IAnimalService {
    public List<Animal> animalsSwimmable(List<Animal> animals);
    public List<Animal> animalFlyable(List<Animal> animals);
    public boolean deleteAnimalSwimmable(List<Animal> animals);
    public boolean deleteAnimalSwimmableAndFlyable(List<Animal> animals);
}
