public class People implements Service{
    @Override
    public void eat() {
        System.out.println("eat by mouth");
    }

    @Override
    public void makeSound() {
        System.out.println("talk something");
    }
}
