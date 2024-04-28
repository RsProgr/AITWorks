package homework21.wrapper;
//Задача 2. Прочитать статью, повторить примеры в ней, кроме примера с ArrayList.
//https://www.w3schools.com/java/java_wrapper_classes.asp

public class WrapperObjects {
    public static void main(String[] args) {
        Integer myInt = 4;
        Double myDouble = 2.24;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        System.out.println("=========================");

        Integer myInt1 = 4;
        Double myDouble1 = 2.24;
        Character myChar1 = 'A';
        System.out.println(myInt1.intValue());
        System.out.println(myDouble1.doubleValue());
        System.out.println(myChar1.charValue());

        System.out.println("========================");
        Integer myInt2 = 100;

        String myStr = myInt2.toString();
        System.out.println(myStr.length());

        System.out.println("============");
        int x = 7;
        Integer y = 111;
        x = y; // автораспаковка
        y = x * 123; // автоупаковка


        System.out.println("==============");
        System.out.println(y);

        System.out.println("===============");
        Integer integer1 = Integer.valueOf("6");
        Integer integer2 = Integer.valueOf(6);
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println("========================");

        Long long1 = Long.valueOf("45");
        Long long2 = Long.parseLong("67");
        System.out.println("long1 = " + long1);
        System.out.println("long2 = " + long2);
        System.out.println("======================");

        Double double1 = Double.valueOf("4.6");
        System.out.println(double1);
        System.out.println("======================");

        String string1 = Integer.toHexString(254);
        System.out.println("254 в 16-ой системе = " + string1);

        String string2 = Long.toOctalString(254);
        System.out.println("254 в 8-ой системе = " + string2);

        String string3 = Integer.toBinaryString(254);
        System.out.println("254 в 2-ой системе = " + string3);
        System.out.println("===========================");

        Integer iob = new Integer(1000); //создаём объект
        System.out.println(iob.byteValue()); //byte
        System.out.println(iob.shortValue()); //short
        System.out.println(iob.intValue()); //int
        System.out.println(iob.longValue()); //long
        System.out.println(iob.floatValue()); //float
        System.out.println(iob.doubleValue()); //double

        System.out.println("====================");
        int[] a = {7, 2, -5, 11, 1};
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        System.out.println("====================");
        for (int n : a) {
            System.out.println(n);

        }
    }
}
