package homework21.computerShop;

import homework21.computerShop.controller.Stock;
import homework21.computerShop.model.Computer;

import java.math.BigInteger;

public class ComputerShopAppl {
    public static void main(String[] args) {

        Stock stock = new Stock(10);
        stock.addComputer(new Computer("i7", 16, 1024, "MSI", new BigInteger("1_000_000_000_000_000_0000")));
        stock.addComputer(new Computer("i5", 8, 2048, "Asus", new BigInteger("2_000_000_000_000_000_0000")));
        stock.addComputer(new Computer("i3", 32, 3000, "HP", new BigInteger("3_000_000_000_000_000_0000")));
        stock.addComputer(new Computer("i9", 128, 3036, "Lenovo", new BigInteger("4_000_000_000_000_000_0000")));
        stock.addComputer(new Computer("i7", 64, 2000, "Toshiba", new BigInteger("5_000_000_000_000_000_0000")));

        System.out.println(stock.getCount());

        stock.addComputer(new Computer("i3", 8, 1000, "Sony", new BigInteger("6_000_000_000_000_000_0000")));
        System.out.println(stock.getCount());
        stock.printComputers();

        stock.addComputer(new Computer("i9", 64, 2500, "msi", new BigInteger("7_000_000_000_000_000_0000")));
        stock.printComputers();

        stock.removeComputer(new BigInteger("7_000_000_000_000_000_0000"));
        System.out.println(stock.getCount());
        stock.printComputers();

        stock.removeComputer(new BigInteger("6_000_000_000_000_000_0000"));
        System.out.println(stock.getCount());
        stock.printComputers();
    }
}