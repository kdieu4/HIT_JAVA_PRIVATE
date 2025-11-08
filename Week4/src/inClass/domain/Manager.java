package inClass.domain;

import java.util.ArrayList;

public class Manager extends Employee {
    public ArrayList<SaleStaff> saleStaffs;
    public ArrayList<Technician> technicians;

    public Manager() {
    }

    public Manager(ArrayList<SaleStaff> saleStaffs, ArrayList<Technician> technicians) {
        this.saleStaffs = saleStaffs;
        this.technicians = technicians;
    }

    public Manager(String name, String country, double salary, ArrayList<SaleStaff> saleStaffs, ArrayList<Technician> technicians) {
        super(name, country, salary);
        this.saleStaffs = saleStaffs;
        this.technicians = technicians;
    }

    public Manager(int id, String name, String country, double salary, ArrayList<SaleStaff> saleStaffs, ArrayList<Technician> technicians) {
        super(id, name, country, salary);
        this.saleStaffs = saleStaffs;
        this.technicians = technicians;
    }

    public SaleStaff getSaleStaff(int saleStaffID) {
        System.out.println("getSaleStaff");
        return saleStaffs.get(saleStaffID);
    }

    public Technician getTechnician(int technicianID) {
        System.out.println("getTechnician");
        return technicians.get(technicianID);
    }

    public ArrayList<SaleStaff> getSaleStaffs() {
        return saleStaffs;
    }

    public void setSaleStaffs(ArrayList<SaleStaff> saleStaffs) {
        this.saleStaffs = saleStaffs;
    }

    public ArrayList<Technician> getTechnicians() {
        return technicians;
    }

    public void setTechnicians(ArrayList<Technician> technicians) {
        this.technicians = technicians;
    }

    @Override
    public void work() {
        System.out.println("Quản lý làm việc");
    }
}
