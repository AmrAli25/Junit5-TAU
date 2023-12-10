package junit5tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {

    @ParameterizedTest(name = "Run : {index} - value : {arguments}")
    @ValueSource(ints = {1, 5, 60})
    void intValues(int theparam){
        System.out.println("theparam = " + theparam);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"FirstString", "SecondString"})
    void strinfValues(String theparam){
        System.out.println("theparam = " + theparam);
    }
}

/**
 * this is a command push testt
 */