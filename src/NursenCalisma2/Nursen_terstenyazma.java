package NursenCalisma2;

public class Nursen_terstenyazma {
    public static void main(String[] args) {

        //soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen
        // kelimeyi ilk harfi büyük , digerler kücükolacak sekilde
        // tersten yazdır

        String input="Mavi";

        String tersStr=input.substring(3).toUpperCase()+
                input.substring(2,3).toLowerCase()+
                input.substring(1,2).toLowerCase()+
                input.substring(0,1).toLowerCase();
        System.out.println(tersStr);


    }
}
