package Bai3.comom;

public class BaseTest {
    public void createDrive(){
        System.out.println("Brower " + Constants.brower);
        System.out.println("Report " + Constants.report);
        System.out.println("Headless " + Constants.headless);
    }
    public void closeDrive( String brower){
        System.out.println("Close brower " + brower );

    }
    public void closeDrive(){
        System.out.println("Close brower " + Constants.brower );

    }

}
