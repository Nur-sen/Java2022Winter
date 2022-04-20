package day32_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {
        LocalDate bugun= LocalDate.now();
        LocalDate dogumGunu=LocalDate.of(2018,04,24);
        System.out.println(Period.between(bugun, dogumGunu));//  P-3Y-11M-7D





    }
}
