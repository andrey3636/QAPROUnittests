public class Discount {
    // i номер покупки
    public int discountCalc(int i, int after18) {
        int result = 0;

        if (i<=0){
            System.out.println("Incorrect product number");
        }
        if (i > 0 & (after18 < 2 & after18 >= 0)) {


            if (i % 2 == 1 & after18 == 0) {
                return result;
            } else if (i % 2 == 0 & after18 == 0) {
                result = 2;
            } else if (i % 2 == 1 & after18 == 1) {
                result = 2;
            } else if (i % 2 == 0 & after18 == 1) {
                result = 4;
            }
            return result;
        } else {
            return -1;
        }
    }
}
