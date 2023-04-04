import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CostTest {

    @Test
    void deliveryCostCalc() {
        Cost cost = new Cost();
        assertEquals(400,
        cost.deliveryCostCalc(2,true,false,"высокая"));

    }
}
