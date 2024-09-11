package Bai2.person;

public class Person {
    public  String gender;
    public String name;
    public int age;
   protected String phone;
    protected String address;

    public Person(String gender, String name, int age, String phone, String address) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected String getPhone() {
        return phone;
    }

    protected String getAddress() {
        return address;
    }


    /*public void showInfo(){
        System.out.println("gender" + gender);
        System.out.println("name" + name);
        System.out.println("age" + age);
        System.out.println(" phone" +  phone);
        System.out.println("address" + address);

    }*/

}
