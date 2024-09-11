package Bai2.person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Nu","Mai",30,"0964","HN");
        person.getName();
        person.getAge();
        person.getPhone();
        person.getAddress();

        /*public void showInfo(){
        System.out.println("Name" + person.getName());
        System.out.println("Age" + person.getAge());
        System.out.println("phone" + person.getPhone());
        System.out.println("address" +  person.getAddress());

    }*/

    }
}
