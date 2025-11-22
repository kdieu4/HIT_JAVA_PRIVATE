package bai2.model;

public class Monkey extends Animal{
    private String  favoriteFruit;

    public Monkey(String favoriteFruit) {
        this.favoriteFruit = favoriteFruit;
    }

    public Monkey(String name, int age, String favoriteFruit) {
        super(name, age);
        this.favoriteFruit = favoriteFruit;
    }

    public String getFavoriteFruit() {
        return favoriteFruit;
    }

    public void setFavoriteFruit(String favoriteFruit) {
        this.favoriteFruit = favoriteFruit;
    }

    @Override
    public void makeSound() {
        System.out.println("Chít chít!!!");
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "favoriteFruit='" + favoriteFruit + '\'' +
                '}';
    }
}
