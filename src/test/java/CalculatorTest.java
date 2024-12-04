import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(new Calculator().add(2,1),3);
    }

    @Test
    void dif() {
        assertEquals(new Calculator().dif(2,1),1);
    }

    @Test
    void div() {
        assertEquals(new Calculator().div(2,1),2);
    }

    @Test
    void times() {
        assertEquals(new Calculator().times(2,1),2);
    }

    @Test
    void solver() {
        assertEquals(new Calculator().solver(2,0,1),-2);
    }
}