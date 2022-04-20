package day09_ternary_Switch;

public class C04_NestedTernary {
    public static void main(String[] args) {
        //verilen sayının pozitif mi negatif mi olduğunu kontrol edip
        //0 ve pozitif sayı ise tek veyea cift
        //negatif sayı ise 100 den büyük veya kücük
        // olduğunu belirleyen bir ternay yazınız

        int sayı=200;

        if(sayı>=0){
            if(sayı%2==0){
                System.out.println("sayı pozitif cift sayı");
            }else{
                System.out.println("sayi pozitif tek sayi");
            }

        }else{
            if(sayı<-100){
                System.out.println("sayı -100 kücük negatif sayı");
            } else{
                System.out.println("sayı >-100  büyük negatif sayı");
            }
            String sonuc=sayı>=0 ?
                    (sayı %2==0 ? " pozitif cift sayı" :"pozitif tek sayı"):
                    (sayı<-100 ? "-100 den kücük negatif sayı" :
                            "-100 den büyük negatif sayı" );
            System.out.println(sonuc);


        }

    }
}
