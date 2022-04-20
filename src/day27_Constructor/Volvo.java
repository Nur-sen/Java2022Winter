package day27_Constructor;

public class Volvo {
    String marka="Volvo";
    String mensei="Isvec";
    String model;
    boolean elektirkliMi;
    int yil;
    String yakit;
    boolean otomatikPilot=otomatikPilotSorgusu();
    int maxHiz=maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektirkliMi=elk;
        yil=yl;
        yakit=ykt;
    }
    public Volvo(){

    }

    public int maxHizAta() {
        int maxHiz=0;
        if(elektirkliMi){
            maxHiz=160;
        }else{
            maxHiz=240;
        }return maxHiz;
    }

    public boolean otomatikPilotSorgusu() {
        boolean sonuc=false;
        if(elektirkliMi){
            sonuc=true;
        }else {
            sonuc=false;
        }
        return sonuc;
    }
    public String toString() {

        String arabaOzellikleri="model : " + model+ " Yakit : " +yakit + " Yil : " + yil+
                 " Max hiz : " +maxHiz;



        return arabaOzellikleri;
    }


}
