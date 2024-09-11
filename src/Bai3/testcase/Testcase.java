package Bai3.testcase;

import Bai3.comom.BaseTest;

public class Testcase extends BaseTest {
    public  void testlogin(){
        createDrive();
        System.out.println("Mở trình duyệt");
        System.out.println("Nhập email");
        System.out.println("Nập pass");
        System.out.println("click login");
        System.out.println("Verify menu dashboar xuất hiện");

        closeDrive();

    }
    public  void testaddCate(){
        createDrive();
        System.out.println("Mở trình duyệt");
        System.out.println("Nhập email");
        System.out.println("Nập pass");
        System.out.println("click login");
        System.out.println("Verify menu dashboar xuất hiện");
        System.out.println("Clicm menu prd");
        System.out.println("click menu cate");
        System.out.println("Veify redrict to add");
        System.out.println("click button add new");
        System.out.println("nhập data");
        System.out.println("click save");
        System.out.println("Verify add success");
        System.out.println("verify thông tin add corect");

        closeDrive();


    }
    public static void main(String[] args) {
        Testcase testcase = new Testcase();
        testcase.testlogin();
        System.out.println("=====================");
        testcase.testaddCate();
    }
}
