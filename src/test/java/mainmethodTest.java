import static org.junit.Assert.*;

public class mainmethodTest {

    @org.junit.Test
    public void add() {
        int result=mainmethod.add(3,3);
        int correct=6;
        assertEquals(6,result);

    }
}