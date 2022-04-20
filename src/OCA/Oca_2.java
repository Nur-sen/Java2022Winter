package OCA;

public class Oca_2 {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x>2 ? x<4 ? 10:8 :7);
        // (x>2 ? (x<4 ? 10:8) : 7) diye yazılır
        // true ve false secenkleri ile analiz yapılır ve konsolda 8 yzar

    }
}
