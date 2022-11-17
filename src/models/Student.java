package models;

public class Student {
    // instance variable
    private int std_id;
    private String std_name;
    private String std_contact;
    private int std_age;
    private String std_address;

    public int getStd_id() {
        return this.std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public String getStd_name() {
        return this.std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public String getStd_contact() {
        return this.std_contact;
    }

    public void setStd_contact(String std_contact) {
        this.std_contact = std_contact;
    }

    public int getStd_age() {
        return this.std_age;
    }

    public void setStd_age(int std_age) {
        this.std_age = std_age;
    }

    public String getStd_address() {
        return this.std_address;
    }

    public void setStd_address(String std_address) {
        this.std_address = std_address;
    }

    // public constructor of Stucent Class
    public Student(int std_id,String std_name,String std_contact,int std_age,String std_address){
        this.std_id = std_id;
        this.std_name = std_name;
        this.std_contact = std_contact;
        this.std_age = std_age;
        this.std_address = std_address;
    }
}
