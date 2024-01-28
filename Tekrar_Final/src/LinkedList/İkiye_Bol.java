package LinkedList;

public class İkiye_Bol {

    public class Tutucu
    {
        Dizi holdated1;
        Dizi holdated2;
    }
    public  Tutucu bolucu(Dizi dizi){
        Tutucu tutuyor = new Tutucu();
        float uzunluk = (float)dizi.uzunluk() / 2;
        uzunluk = (int)uzunluk;
        Dizi temp , temp2;
        temp = temp2 = dizi;
        temp.head = temp2.head = dizi.head;
        int cnt = 0;
        while (cnt != uzunluk)
        {
            temp2.head = temp.head;
            temp.head = temp.head.next;
            cnt++;
        }
        temp.tail = temp.head;
        tutuyor.holdated1 = temp;
        tutuyor.holdated2 = null;
        return tutuyor;
        }
    }
