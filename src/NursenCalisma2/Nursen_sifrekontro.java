package NursenCalisma2;

public class Nursen_sifrekontro {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan bir sifre girmesini isteyin.
        // Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //    - Ilk harf buyuk harf olmali
        //    - Son harf kucuk harf olmali
        //    - Sifre bosluk icermemeli
        //    - Sifre uzunlugu en az 8 karakter olmali
        String sifre ="Asdf12345n";

        boolean ilkHarf = false;
        boolean sonHarf=false;
        if(sifre.charAt(0)>= 'A' && sifre.charAt(0)<='Z'){
           ilkHarf=true;
        }else{
            System.out.println("Ilk harf buyuk harf olmali");
        }
        if(sifre.length()-1>='a' && sifre.length()-1<='z'){
            sonHarf=true;

        }else {
            System.out.println("sifrenizin son harfi kücük olmali");
        }

        boolean bosluk=false;
        if(!sifre.contains(" ")){
            bosluk=true;
        }else {
            System.out.println("sifreniz bosluk icermemeli");
        }
       boolean uzunluk=false;
        if(sifre.length()>=8){
            uzunluk=true;
        }else {
            System.out.println("sifreniz en az 8 karakterli olmali");
        }
        if(ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarılı bir sekilde kaydedildi");
        }

    }
}
