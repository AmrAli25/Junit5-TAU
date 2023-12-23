package junit5tests;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTests {
    @RepeatedTest(5)
    void firstRepeatedMethod(){
        System.out.println("We are repeating this test");
    }
    @RepeatedTest(value = 3, name = "Running Repetition: {currentRepetition}." + "Total is: {totalRepetitions}")
    void secondRepeatedMethod(){
        System.out.println("We are repeating this test");
    }

    @RepeatedTest(3)
    void thirdRepeatedMethod(RepetitionInfo repetitionInfo){
        System.out.println("this code will run at each repetition");
        Assumptions.assumingThat(repetitionInfo.getCurrentRepetition() == 3, () -> System.out.println("this code only runs for repetition 3"));
    }
}
