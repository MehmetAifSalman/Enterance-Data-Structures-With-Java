package pkt1;

public class Liste {
    Node Head;
    Node Tail;

    void sona_ekle(int a)
    {
        Node obje = new Node();
        obje.data = a;
        if(Head == null)
        {

            System.out.println("Henüz liste oluşturlmamış");
            obje.next = null;
            Head = obje;
            Tail = obje;
        }
        else {
            Tail.next = obje;
            Tail = obje;
            System.out.println("Sona eleman eklendi");
        }
    }

    void basa_ekle(int a)
    {
        Node obje = new Node();
        obje.data = a;

        if(Head == null)
        {
            Head = obje;
            Tail = obje;
            System.out.println("Liste oluşturuldu");
        }
        else
        {

            obje.next = Head;
            Head = obje;
            System.out.println("Sona eleman eklendi");
        }
    }
    void araya_ekle(int indis , int a)
    {
        Node obje = new Node();
        obje.data = a;
        if(Head == null && indis == 0)
        {

            System.out.println("Henüz liste oluşturlmamış");
            obje.next = null;
            Head = obje;
            Tail = obje;
        } else if (Head != null && indis == 0) {
            obje.next = Head;
            Head = obje;
            System.out.println("0 nolu indise eklendi");
        } else {
            int n = 0;
            Node temp = Head;
            Node temp2 = Head;
            while (temp != null)
            {
                n++;
                temp = temp.next;

            }
            if(n == indis)
            {
                temp.next = obje;
                obje.next = temp;
                System.out.println("Eleman Eklendi");
            }
            else
            {
                temp = Head;
                temp2 = Head;
                int i = 0;
                while (i != indis)
                {
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
            }
        }
    }

    void yazdir()
    {
        if(Head == null)
        {
            System.out.println("Bu liste boş");
        }
        Node temp = Head;
        while (temp.next != null)
        {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
    }
    void bastan_sil()
    {
        if(Head == null)
        {
            System.out.println("Liste boş , silinecek nesne yok");
        } else if (Head.next == null) {
            Head = null;
            Tail = null;
            System.out.println("Listede kalan son eleman da silindi");
        }
        else
        {
            Head = Head.next;
            System.out.println("Baştaki eleman silindi");
        }
    }

    void sondan_sil()
    {
        if(Head == null)
        {
            System.out.println("Liste boş , silinecek nesne yok");
        } else if (Head.next == null) {
            Head = null;
            Tail = null;
            System.out.println("Listede kalan son eleman da silindi");
        }
        else
        {
            Node temp = Head;
            Node temp2 = Head;
            while (temp.next != null)
            {
               temp2 = temp;
               temp = temp.next;
            }
            temp2.next = null;
            Tail = temp2;
            System.out.println("Sondan eleman silme");
        }
    }

}
