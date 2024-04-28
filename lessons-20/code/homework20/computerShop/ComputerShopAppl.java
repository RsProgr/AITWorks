package homework20.computerShop;

import homework20.computerShop.controller.Stock;
import homework20.computerShop.model.Computer;

public class ComputerShopAppl {
    public static void main(String[] args) {

        Stock stock = new Stock(500);
        stock.addComputer(new Computer("i7", 16, 1024, "MSI", "9432540312abc128594cv"));
        stock.addComputer(new Computer("i5", 8, 2048, "Asus", "dv1005749209cvb19049"));
        stock.addComputer(new Computer("i3", 32, 3000, "HP", "950496fd8538fg503950"));
        stock.addComputer(new Computer("i9", 128, 3036, "Lenovo", "8684838vc093109583zx"));
        stock.addComputer(new Computer("i7", 64, 2000, "Toshiba", "8694032mlv5439281vc0"));

        System.out.println(stock.getCount());

        stock.addComputer(new Computer("i3", 8, 1000, "Sony", "21354vb69874nmb12375"));
        System.out.println(stock.getCount());
        stock.printComputers();

        stock.addComputer(new Computer("i9", 64, 2500, "msi", "23546hgh67894556jg54"));
        stock.printComputers();

        stock.removeComputer("23546hgh67894556jg54");
        System.out.println(stock.getCount());
        stock.printComputers();

        stock.removeComputer("9432540312abc128594cv");
        System.out.println(stock.getCount());
        stock.printComputers();
    }
}