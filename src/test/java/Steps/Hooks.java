package Steps;

import Base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks extends Base {
    public Hooks() throws IOException {
    }

    @Before
    public void runsBeforeAnyScenario(){
        System.out.println("runs Before All Scenarios");
    }
    @After
    public void runsAfterAnyScenario(){
        driver.quit();
    }
}
