package day27_Constructor;

public class Toyota {
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motoruVarMi=true;
    String model;
    String yakit;
    int yil;

    public void maxHiz(){
        if(yakit.equals("benzin")){
            System.out.println("Benzinli araclar max 240 km/hiz yapar");
        }else if(yakit.equals("Dizael")){
            System.out.println("Dizel araclar max 260 km/hiz yapar");
        }
    }
    public void renkTercihleri(){
        if(model.equals("corolla")){
            System.out.println("Corolla renk secenekleri kirmizi ve beyaz");
        }else if(model.equals("Yaris")){
            System.out.println("yaris renk secenekleri sari ve lacivert");

        }
    }


}
