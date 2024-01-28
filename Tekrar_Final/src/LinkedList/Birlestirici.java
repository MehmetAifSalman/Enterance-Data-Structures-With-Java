package LinkedList;

public class Birlestirici {
   public static Dizi birlestir(Dizi dizi1 , Dizi dizi2)
   {
       dizi1.tail.next = dizi2.head;
       Dizi yenidizi = dizi1;
       return yenidizi;
   }
}
