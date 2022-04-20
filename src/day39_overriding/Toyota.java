package day39_overriding;

public class Toyota extends Araba {

    String hiz="toyota araclar";
    String marka="Toyota";
    String sirketMerkezi="Japonya";


    public  void motor(){
        System.out.println("Toyota arabalar toyota motor kullanirlar" );
    }

    public void garanti (){
        System.out.println("Toyota arabalar 10 yil garantilidir");
    }



}
