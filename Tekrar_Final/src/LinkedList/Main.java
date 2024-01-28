package LinkedList;

public class Main {
    public static void main(String[] args) {
        Dizi liste1 = new Dizi();
        İkiye_Bol bol = new İkiye_Bol();
        liste1.insert_toRight(12);
        liste1.insert_toRight(23);
        liste1.insert_toRight(34);
        liste1.insert_toRight(56);
        liste1.insert_toRight(465);
        liste1.insert_toRight(45545);
        liste1.insert_toRight(9879);
        liste1.insert_toRight(321);
        liste1.insert_toRight(5465);
        System.out.println("-------------------------");
        İkiye_Bol.Tutucu bolunmus = bol.bolucu(liste1);
        System.out.println(bolunmus.holdated1.tail.data);
    }
}