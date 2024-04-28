package homework;

public class shopping {

    public static void main(String[] args) {


        double priceA = 50.5;
        double discountA = 5.0;
        int quantityA = 5;

        double priceB = 40.0;
        double discountB = 10.0;
        int quantityB = 8;

        double totalPrice = calcTotalPrice(priceA, discountA, quantityA, priceB, discountB, quantityB);
        double totalDiscount = calcTotalDiscount(priceA, discountA, quantityA, priceB, discountB, quantityB);


        if (totalPrice > 100) {
            double additionalDiscount = totalPrice * 0.05;
            totalPrice -= additionalDiscount;
            totalDiscount += additionalDiscount;
        }

        totalPrice = Math.round(totalPrice * 100.0) / 100.0;
        totalDiscount = Math.round(totalDiscount * 100.0) / 100.0;

        System.out.println("Total purchase cost: " + totalPrice + " € ");
        System.out.println("Discount received: " + totalDiscount + " €");
    }

    public static double calcTotalPrice(double priceA, double discountA,
                                        int quantityA, double priceB, double discountB, int quantityB) {
        double totalA = priceA * quantityA * (1 - discountA / 100);
        double totalB = priceB * quantityB * (1 - discountB / 100);
        return totalA + totalB;
    }

    public static double calcTotalDiscount(double priceA, double discountA,
                                           int quantityA, double priceB,
                                           double discountB, int quantityB) {

        double totalDiscountA = (priceA * quantityA * discountA / 100);
        double totalDiscountB = (priceB * quantityB * discountB / 100);
        return totalDiscountA + totalDiscountB;
    }
}
