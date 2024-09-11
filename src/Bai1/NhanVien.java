package Bai1;

public class NhanVien {
    public  String mssv;
    public String name;
    public int age;
    public String phone;
    public String address;

    public NhanVien() {
    }

    public NhanVien(String mssv, String name, int age, String phone, String address) {
        this.mssv = mssv;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
    public void showInfo(){
        System.out.println("mssv" + mssv);
        System.out.println("name" + name);
        System.out.println("age" + age);
        System.out.println(" phone" +  phone);
        System.out.println("address" + address);

    }
}
