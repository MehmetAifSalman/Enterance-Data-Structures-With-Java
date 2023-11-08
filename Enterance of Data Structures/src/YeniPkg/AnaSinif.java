package YeniPkg;

import java.util.Scanner;

public class AnaSinif {

    String name;
    int no;
    int age;

    public static void ikinciSinifDegerYazdir(ikiciSinif ikiciSinif)
    {
        ikiciSinif.setAraba("Opel");
        ikiciSinif.setAraba_motor(1.6f);
        ikiciSinif.setAraba_fiyat(111114);
        System.out.println(ikiciSinif.getAraba_fiyat());
        System.out.println(ikiciSinif.getAraba_motor());
        System.out.println(ikiciSinif.getAraba());

    }
    public static ikiciSinif  ikinciSinifaDegerAta(int sinifDeger1, String sinifDeger2, float sinifDeger3){

        ikiciSinif obje = new ikiciSinif();
        obje.setAraba_fiyat(sinifDeger1);
        obje.setAraba_motor(sinifDeger3);
        obje.setAraba(sinifDeger2);
        return obje;
    }

    public static void dondurmeyen(int a){
        System.out.println(a + " Buarada değer dödürmeyen fonksiyonu yazdık ");
    }

    public static void olustur(String name){

        name = name;
        System.out.println(name);
    }
    public static void olustur(int no)
    {
        no = no;
        System.out.println(no);

    }
    public static  void olustur(int age , int a)
    {

        age = age;
        System.out.println(age);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        olustur("Akif");
        olustur(45);
        olustur(32,0);
        dondurmeyen(78);


        ikinciSinifDegerYazdir(new ikiciSinif());

        ikiciSinif[] liste = new ikiciSinif[10];

        for (int i = 0; i < 10; i++) {
            liste[i] = new ikiciSinif();
            liste[i].setAraba(scanner.nextLine());
            liste[i].setAraba_motor(scanner.nextFloat());
            liste[i].setAraba_fiyat(scanner.nextInt());

        }
        for (int i = 0; i < 10; i++) {
            System.out.println(liste[i].getAraba_motor());
            System.out.println(liste[i].getAraba());
            System.out.println(liste[i].getAraba_fiyat());

        }



    }
}
