package junit5tests;

import listeners.Listener;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(Listener.class)
public class DisabledEnabledTest {

    @Test
    @Disabled(value = "Demo for the @Disabled")
    void firstTest(){
        System.out.println("This is the first test method");
    }

    @Test
    @DisabledOnOs(value = OS.MAC, disabledReason = "Demo for @DisabledOnOS")
    void secondTest(){
        System.out.println("This is the second test method");
    }
    @Test
    @DisabledIfSystemProperty(named = "env", matches = "staging", disabledReason = "Demo for @DisabledIfSystemProperty")
    void thirdTest(){
        System.out.println("This is the third test method");
    }
    @Test
    @DisabledIf(value = "provider", disabledReason = "Demo of @DisabledIf")
    void forthTest(){
        System.out.println("This is the forth test method");
    }
    @Test
    void fifthTest(){
        System.out.println("This is the fifth test method");
    }
    boolean provider(){
        return true;

    }
}
