package homework.model;

public class Smartphone extends Product {
    private boolean has5G;

    public Smartphone() {
    }

    public Smartphone(boolean has5G) {
        this.has5G = has5G;
    }

    public Smartphone(String name, String description, double price, boolean has5G) {
        super(name, description, price);
        this.has5G = has5G;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    @Override
    public String getInfo() {
        return "\n---SMARTPHONE---\n" + super.getInfo() + "Hỗ trợ 5G: " + (this.has5G ? "Có" : "Không");
    }

    @Override
    public String toString() {
        return super.toString() + "\nSmartphone{" + "has5G=" + has5G + '}';
    }
}
