package claSS01;

import org.testng.annotations.Test;

public class dependsOn {

    @Test
    public void Login(){

        System.out.println("I am here");
    }

    @Test(dependsOnMethods ={"Login"})
    public void DashBoardVerification(){

        System.out.println("After login I am verifying dashboard");
    }
}
