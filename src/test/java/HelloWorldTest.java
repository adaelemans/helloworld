import static org.junit.Assert.*;

public class HelloWorldTest {

    @org.junit.Test
    public void one() {
        HelloWorld myhw = new HelloWorld();
        assertEquals(1,myhw.one());
    }
}