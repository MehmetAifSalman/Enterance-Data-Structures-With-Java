package PKT_1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Liste kuyruk = new Liste();

        while(true){
            System.out.println("\n----- MENU -----");
            System.out.println("1. Kuyruğa Ekle");
            System.out.println("2. Kuyruktan sil");
            System.out.println("3. Kuyruktaki Elemanları Listele");
            System.out.println("4. kuyruta eleman ara");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminizi yapınız: ");
            int choice = scan.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Ad : ");
                    String ad = scan.next();
                    System.out.print("soyad: ");
                    String soyad = scan.next();
                    System.out.print("Doğum Tarihi: ");
                    String dogumTarihi = scan.next();
                    System.out.print("Telefon Numarası: ");
                    String telNo = scan.next();

                    Node newElement = new Node(ad,soyad,dogumTarihi,telNo);
                    kuyruk.kuyrugaEkle(newElement);
                    break;
                case 2:
                    kuyruk.kuyruktanSil();
                    break;
                case 3:
                    kuyruk.elemanlarıListele();
                    break;
                case 4:
                    System.out.print("aramak istediğiniz kişinin ismini yazınız: ");
                    String name = scan.next();
                    kuyruk.elemanAra(name);
                case 5:
                    System.out.println("programdan çıkılıyor...");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("gereksiz seçim. Tekrar deneyiniz.");
                    continue;
            }

        }
    }
}
