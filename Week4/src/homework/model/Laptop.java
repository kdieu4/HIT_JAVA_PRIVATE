package homework.model;

public class Laptop extends Product {
    private String ram;
    private String cpu;

    public Laptop() {
    }

    public Laptop(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }


    public Laptop(String name, String description, double price, String ram, String cpu) {
        super(name, description, price);
        this.ram = ram;
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String getInfo() {
        return "\n---LAPTOP---\n" +
        super.getInfo() +
        "RAM: " +  this.ram + "\n" +
        "CPU: " + this.cpu + "\n";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLaptop{" +
                "ram='" + this.ram + "\'" +
                "cpu='" + this.cpu + "\'}"
                ;
    }
}
