package claSS01;

import org.testng.annotations.Test;

public class priority {

    @Test(priority = 3)
    public void Atest(){
        System.out.println("TestA");


}
    @Test(priority = 1)
    public void Btest() {
        System.out.println("TestB");
    }
    @Test(priority = 2)
    public void Ctest() {
        System.out.println("TestC");
    }



}
