package inClass.domain;

public class SaleStaff extends Employee {
    private int numbersOfSale;

    public SaleStaff(int numbersOfSale) {
        this.numbersOfSale = numbersOfSale;
    }

    public SaleStaff(String name, String country, double salary, int numbersOfSale) {
        super(name, country, salary);
        this.numbersOfSale = numbersOfSale;
    }

    public SaleStaff(int id, String name, String country, double salary, int numbersOfSale) {
        super(id, name, country, salary);
        this.numbersOfSale = numbersOfSale;
    }

    public SaleStaff() {
    }

    public int getNumbersOfSale() {
        return numbersOfSale;
    }

    public void setNumbersOfSale(int numbersOfSale) {
        this.numbersOfSale = numbersOfSale;
    }

    @Override
    public void work() {
        System.out.println("Nhân viên làm việc");
    }
}
