import java.util.Arrays;
import java.util.Scanner;

public class Phone implements phoneInterface{
    private String name;
    private String brand;
    private String password;
    private Contact[] contacts;

    public Phone(String name, String brand, String password, Contact[] contacts) {
        this.name = name;
        this.brand = brand;
        this.password = password;
        this.contacts = contacts;
    }

    public Phone() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String turnOn(String password) {

        String on = new Scanner(System.in).nextLine();
        if (on.equals("on")){

            if (password.equals(getPassword())){
                return "Phone is turning on";
            }
        }
        return "invalid password";
    }

    @Override
    public String call(long phoneNumber) {
        for (Contact num:contacts) {
           // System.out.println("Enter phone number: ");
            if (phoneNumber==num.getPhoneNumber()){
                return " You are calling to "+num.getFullName();
            }
        }
        return null;
    }

    @Override
    public String call(String name) {
        for (Contact nameContact:contacts) {
           // System.out.println("Enter name of contact: ");
            if (name.equals(nameContact.getFullName())){
                return "You are colling to "+nameContact.getFullName()+" "+ nameContact.getPhoneNumber();
            }
        }
        return null;
    }

    @Override
    public Contact searchContact(String name) {
        for (Contact search:contacts) {
            if (name.equals(search.getFullName())){
                return search;
            }
        }
        return null;
    }

    @Override
    public Contact updateName(String name1, String name2) {
        for (Contact replace:contacts) {
            if (replace.getFullName().equals(name1)) {
                replace.setFullName(name2);
                return replace;
            }
        }
        return null;
    }

    @Override
    public void getAllContacts() {
        for (Contact allContacts:contacts) {
            System.out.println(allContacts);
        }

    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", password='" + password + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
