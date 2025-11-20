package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    private Greeting greeting;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All\n");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("    Before Each");
        greeting = new Greeting();
    }

    @Test
    void testHelloWorld() {
        System.out.println("        " + greeting.helloWorld());
    }

    @Test
    void testHelloWorld2() {
        System.out.println("        " + greeting.helloWorld("Neil"));
    }

    @AfterEach
    void afterEach(){
        System.out.println("    After Each\n");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After All");
    }
}