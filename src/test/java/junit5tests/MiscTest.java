package junit5tests;

import org.junit.jupiter.api.*;

public class MiscTest {
    @Test
    @Timeout(5)
    void timeout() throws InterruptedException {
        System.out.println("This test is with a timeout of 5 seconds");
        Thread.sleep(6000);
    }
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    @Nested
    class NestedTest{
        @BeforeAll
        void beforAll(){
            System.out.println("before all in nested test");
        }
        @Test
        void nestedTestMethod(){
            System.out.println("Nested test method");
        }
    }
}
