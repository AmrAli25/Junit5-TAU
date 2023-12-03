package junit5tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FirstTestClass {

    @Test
    void firstMethod(){
        System.out.println("This is our first test method");
    }

    @Test
    @DisplayName("TC12 - the second method")
    void secondMethod(){
        System.out.println("This is our second test method");
    }

}
