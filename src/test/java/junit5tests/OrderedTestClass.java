package junit5tests;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrderedTestClass {
    @BeforeAll
    void beforeAll(){
        System.out.println("-- This is the before all method");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("This is the before each method");
    }

    @AfterAll
    void afterAll(){
        System.out.println(" This is the after all method");
    }

    @AfterEach
    void afterEach(){
        System.out.println(" This is the after each method");
    }

    @Test
    void firstMethod(){
        System.out.println("This is our first test method");
    }

    @Test
    @DisplayName("TC12 - the second method")
    void secondMethod(){
        System.out.println("This is our second test method");
    }
    @Test
    @DisplayName("Third method")
    void thirdMethod(){
        System.out.println("This is our third test method");
    }

}
