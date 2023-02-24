import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Abdugani uulu Manasbek",221788717);
        Contact contact2 = new Contact("Abduvahob uulu Matmusa",221243672);
        Contact contact3 = new Contact("Islambek uulu Adilet",222384928);
        Contact contact4 = new Contact("Kubanychbekov Taalai",703192046);
        Contact contact5 = new Contact("Joldoshbekov Murza",505293020);

        Contact[] contacts = {contact1,contact2,contact3,contact4,contact5};

        Phone phone1 = new Phone("Iphon 13","Apple","12345",contacts);
        Phone phone2 = new Phone("Note 20","Samsung","112233",contacts);

        System.out.println(phone1.call("Abdugani uulu Manasbek"));
        System.out.println(phone1.call(221243672));
        System.out.println(" To turn on press 'on' ");
        System.out.println(phone1.turnOn(  "12345"));
        System.out.println(phone1.searchContact("Islambek uulu Adilet"));
        System.out.println(phone1.updateName("Joldoshbekov Murza","Joldubaeva Ainura"));
        phone1.getAllContacts();
    }
}