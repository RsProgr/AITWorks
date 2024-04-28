package homework.supermarket;

import homework.supermarket.model.child.Food;
import homework.supermarket.model.child.MeatFood;
import homework.supermarket.model.child.MilkFood;
import homework.supermarket.model.parent.Product;

public class MarketAppl {
    public static void main(String[] args) {

        Product[] products = new Product[4];

        products[0] = new Product(50, "Gift card", 1000L);
        products[1] = new Food(30, "Avakado", 1001L, "2024-04-15");
        products[2] = new MeatFood(20, "Sausages", 1002L, "2024-04-10", "biff");
        products[3] = new MilkFood(3, "Milk", 1003L, "2024-04-05", "cow", 3.5);


        printProducts(products);
        System.out.println(" ");
        System.out.println("Total price: " + String.format("%.2f", calculateTotalPrice(products)) + " euro");


        long barcodeToFind = 565455544;
        Product productWithBarcode = getProductByBarcode(products, barcodeToFind);
        System.out.println(" ");

        if (productWithBarcode != null) {
            System.out.println("Product with barcode " + barcodeToFind + ": " + productWithBarcode);
        } else {
            System.out.println("Product with barcode " + barcodeToFind + " not found.");
        }
        System.out.println("===========Not Food products=========");
        printNotFoodProducts(products);
    }

    private static void printNotFoodProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (!(products[i] instanceof Food)) {
                System.out.println(products[i]);

            }

        }
    }

    public static void printProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    public static double calculateTotalPrice(Product[] products) {
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice += products[i].getPrice();
        }
        return totalPrice;
    }


    public static Product getProductByBarcode(Product[] products, long barCode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getBarCode() == barCode) {
                return products[i];
            }
        }
        return null;
    }
}