import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @org.junit.jupiter.api.Test
    void one() {
        assertEquals(2,(new HelloWorld().one()));
    }
}