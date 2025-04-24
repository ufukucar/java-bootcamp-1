import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        double x = 0.1;

        System.out.println(x);

        double y = 0.2;
        double z = x + y;

        System.out.println(z);

        /** ÇIKTI:
         * 0.1
         * 0.30000000000000004
         */

        BigDecimal x  = new BigDecimal("0.1");

        System.out.println(x);

        BigDecimal y = new BigDecimal("0.2");

        System.out.println(x.add(y));
        System.out.println(x.subtract(y));



    }
}