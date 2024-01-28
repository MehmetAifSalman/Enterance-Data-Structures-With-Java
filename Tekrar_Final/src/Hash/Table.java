package Hash;

public class Table {

    Node[] listem;
    int size;

    Table(int size)
    {
        this.size = size;
        listem = new Node[size];
        for (Node i:
             listem) {
            i = new Node();
        }
    }
    private int indexUret(int key)
    {
        return key % this.size;
    }

    public void ekle(int key , String data)
    {
        int indis = indexUret(key);
        Node eleman = new Node(key,data);
        Node temp = listem[indis];
        while (temp.next != null)
        {
            temp = temp.next;

        }
        temp = eleman;
    }

    public void sil(int key)
    {
        var indis = indexUret(key);
        Node temp = listem[indis];
        Node temp2 = listem[indis];
        if(temp.next == null)
        {
            System.out.println("Value is null");
        } else if (temp.next.next == null && key == temp.next.key) {
            temp.next = null;
        }
        else
        {
            while (temp.next != null)
            {
                if (temp.key == key)
                {
                    temp2.next = temp.next;
                }
                temp2 = temp;
                temp = temp.next;
            }
        }
    }

}
