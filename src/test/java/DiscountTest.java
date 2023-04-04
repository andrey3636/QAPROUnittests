import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DiscountTest {

    //int i нечетный и after18 = 0 --- 0
    //int i четный и after18 = 0    2
    //int i нечетный и after18 = 1   2
    //int i четный и after18 = 1    4


    @ParameterizedTest
    @MethodSource("validData")
    void discountCalc(int result, int i, int after18) {
        Discount discount = new Discount();
        assertEquals(result, discount. discountCalc(i, after18));

    }
    static Stream<Arguments> validData() {
        return Stream.of(
                arguments(0, 1, 0),
                arguments(2, 6, 0),
                arguments(2, 3, 1),
                arguments(4, 10, 1)

        );
    }

    @Test
    public void discountCalcInvalidData(){
        Discount discount = new Discount();
        System.out.println(discount.discountCalc(1,1));

    }

}