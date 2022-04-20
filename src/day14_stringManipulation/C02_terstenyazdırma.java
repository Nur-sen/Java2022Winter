package day14_stringManipulation;

public class C02_terstenyazdırma {
    //soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen
    // kelimeyi ilk harfi büyük , digerler kücükolacak sekilde
    // tersten yazdır

    //

    public static void main(String[] args) {
        String input="nursen";

        String tersStr=input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersStr);
    }
}
