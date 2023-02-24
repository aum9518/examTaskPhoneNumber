public interface phoneInterface {
    String turnOn(String password);
    String call(long phoneNumber);
    String call(String name);
    Contact searchContact(String name);
    Contact updateName(String name1,String name2);
    void getAllContacts();

}
