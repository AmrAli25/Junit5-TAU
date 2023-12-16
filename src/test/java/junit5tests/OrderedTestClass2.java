package junit5tests;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTestClass2 {


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
    @Order(2)
    void firstMethod(){
        System.out.println("This is our first test method");
    }

    @Test
    @DisplayName("TC12 - the second method")
    void secondMethod(){
        System.out.println("This is our second test method");
    }

    @Test
    @Order(1)
    void thirdMethod(){
        System.out.println("This is the third test method");
    }

}
