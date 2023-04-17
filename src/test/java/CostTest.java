import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CostTest {

    @Test
    void deliveryCostCalc() {
        Cost cost = new Cost();
        assertEquals(400,
        cost.deliveryCostCalc(2,true,false,"высокая"));

    }
    @ParameterizedTest

    @MethodSource("validData")

    void deliveryCostCalculate(double expectedResult, double distance, boolean big, boolean fragile, String load) { // передаем в метод deliveryCostCalculate значения

        Cost cost = new Cost(); // создаем экземпляр класса CostPractice

        assertEquals(expectedResult, cost.deliveryCostCalc(distance, big, fragile, load)); // используем ранне переданы значения
    }
    static Stream<Arguments> validData() { // validData = @MethodSource("validData") ранее описана в первой части
        return Stream.of(
                arguments(720, 0, false, true, "очень высокая"),
                arguments(400, 0, true, false, "высокая"),
                arguments(540, 0, false, true, "повышенная"),
                arguments(400, 0, true, false, "обычная"),
                arguments(550, 0.1, true, true, "обычная"),
                arguments(400, 0.1, false, false, "повышенная"),
                arguments(880, 0.1, true, true, "очень высокая"),
                arguments(630, 0.1, false, true, "высокая"),
                arguments(400, 1, true, false, "очень высокая"),
                arguments(630, 1, false, true, "высокая"),
                arguments(660, 1, true, true, "повышенная"),
                arguments(400, 1, false, false, "обычная"),
                arguments(660, 1.9, true, true, "повышенная"),
                arguments(450, 1.9, false, true, "обычная"),
                arguments(400, 1.9, true, false, "очень высокая"),
                arguments(630, 1.9, false, true, "высокая"),
                arguments(880, 2, true, true, "очень высокая"),
                arguments(400, 2, false, false, "высокая"),
                arguments(660, 2, true, true, "повышенная"),
                arguments(400, 2, true, false, "обычная"),
                arguments(400, 2.1, false, false, "повышенная"),
                arguments(600, 2.1, true, true, "обычная"),
                arguments(400, 2.1, false, false, "очень высокая"),
                arguments(840, 2.1, true, true, "высокая"),
                arguments(400, 6.6, false, false, "обычная"),
                arguments(800, 6.6, false, true, "очень высокая"),
                arguments(420, 6.6, true, false, "высокая"),
                arguments(400, 6.6, true, false, "повышенная"),
                arguments(400, 9.9, false, false, "повышенная"),
                arguments(960, 9.9, true, true, "очень высокая"),
                arguments(400, 9.9, false, false, "высокая"),
                arguments(400, 9.9, false, false, "обычная"),
                arguments(700, 10, false, true, "высокая"),
                arguments(400, 10, true, false, "повышенная"),
                arguments(500, 10, false, true, "обычная"),
                arguments(480, 10, true, false, "очень высокая"),
                arguments(720, 10.1, false, true, "повышенная"),
                arguments(400, 10.1, false, false, "обычная"),
                arguments(1120, 10.1, true, true, "очень высокая"),
                arguments(420, 10.1, false, false, "высокая"),
                arguments(840, 10.1, true, true, "повышенная"),
                arguments(600, 10.1, false, true, "обычная"),
                arguments(480, 15, false, false, "очень высокая"),
                arguments(980, 15, true, true, "высокая"),
                arguments(400, 15, false, false, "повышенная"),
                arguments(700, 15, true, true, "обычная"),
                arguments(840, 15, false, true, "высокая"),
                arguments(480, 15, true, false, "повышенная"),
                arguments(600, 15, false, true, "обычная"),
                arguments(640, 15, true, false, "очень высокая"),
                arguments(840, 15, true, true, "повышенная"),
                arguments(400, 15, false, false, "обычная"),
                arguments(1120, 15, true, true, "очень высокая"),
                arguments(420, 15, false, false, "высокая"),
                arguments(400, 29.9, true, false, "обычная"),
                arguments(960, 29.9, false, true, "очень высокая"),
                arguments(560, 29.9, true, false, "высокая"),
                arguments(720, 29.9, false, true, "повышенная"),
                arguments(400, 29.9, false, false, "обычная"),
                arguments(1120, 29.9, true, true, "очень высокая"),
                arguments(420, 29.9, false, false, "высокая"),
                arguments(840, 29.9, true, true, "повышенная"),
                arguments(600, 29.9, false, true, "обычная"),
                arguments(640, 29.9, true, false, "очень высокая"),
                arguments(840, 29.9, false, true, "высокая"),
                arguments(480, 29.9, true, false, "повышенная"),
                arguments(400, 30, false, false, "повышенная"),
                arguments(700, 30, true, true, "обычная"),
                arguments(480, 30, false, false, "очень высокая"),
                arguments(840, 30, false, true, "высокая"),
                arguments(480, 30, true, false, "повышенная"),
                arguments(600, 30, false, true, "обычная"),
                arguments(1120, 30, true, true, "очень высокая"),
                arguments(420, 30, false, false, "высокая"),
                arguments(840, 30, true, true, "повышенная"),
                arguments(980, 30, true, true, "высокая"),
                arguments(700, 30.1, true, false, "высокая"),
                arguments(400, 30.1, false, false, "обычная"),
                arguments(600, 30.1, true, false, "повышенная"),
                arguments(500, 30.1, true, false, "обычная"),
                arguments(640, 45, false, false, "очень высокая"),
                arguments(480, 45, false, false, "повышенная")
    );
    }


}
/**
  arguments(400, 30.1, false, true, "повышенная"),
  arguments(800, 30.1, true, true, "очень высокая"),
  arguments(420, 30.1, false, true, "высокая"),
  arguments(640, 30.1, false, true, "очень высокая"),
  arguments(500, 45, true, true, "обычная"),
  arguments(560, 45, false, true, "высокая"),
  arguments(600, 45, true, true, "повышенная"),
  arguments(700, 45, true, true, "высокая"), // все что выше это хрупкие грузы
  arguments(300, 15, true, true, "высокая"), // распознает ли неправильный expected result
  arguments(700, -1, true, true, "высокая"), // физика против
  arguments(400, 45, "andrey", "andrey", "повышенная"), // неверные значения
  arguments(400, 15,false, false, "gjdsityyfz") // алфавит
 **/
