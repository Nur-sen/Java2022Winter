package Printf;

public class C01_TemelBilgiler {
    public static void main(String[] args) {
        int sayi=123;
        String str="Ahmet Java cok kolay";
        double dob=1.0205030456;
        System.out.println("- " + sayi + " -" + str+ " -" +dob);

        System.out.printf("sayi: %d, str: %10S, dob: %f",sayi,str,dob);
    }
}
