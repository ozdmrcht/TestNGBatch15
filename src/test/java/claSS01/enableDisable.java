package claSS01;

import org.testng.annotations.Test;

public class enableDisable {
    @Test(enabled = false) //disabled.
    public void Atest(){
        System.out.println("I  am the first test case");


    }
    @Test
    public void Btest() {
        System.out.println("I  am the second test case");
    }


    @Test(enabled = false)  //disabled
    public void Ctest() {
        System.out.println("I  am the third test case");
    }

    }

