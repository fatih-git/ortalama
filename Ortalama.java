import java.util.Scanner;

public class Ortalama {

    public static void main(String[] args) {

        int mat, fiz, kim, tur, tar, muz, ort;
        String cevap;

        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen matematik notunuzu girin:");
        mat=input.nextInt();

        System.out.print("Lütfen fizik notunuzu girin:");
        fiz=input.nextInt();

        System.out.print("Lütfen Türkçe notunuzu girin:");
        tur=input.nextInt();

        System.out.print("Lütfen tarih notunuzu girin:");
        tar=input.nextInt();

        System.out.print("Lütfen kimya notunuzu girin:");
        kim=input.nextInt();

        System.out.print("Lütfen müzik notunuzu girin:");
        muz=input.nextInt();

        ort=(mat+fiz+kim+tur+tar+muz)/6;

        System.out.println("Not ortalamanız:"+ort);

        cevap=(ort>=60) ? "Sınıfı geçti.":"Sınıfta Kaldı!";

        System.out.println(cevap);

    }

}
