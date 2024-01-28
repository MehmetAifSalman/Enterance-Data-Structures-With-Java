package LinkedList;

public class Dizi {
      Node head;
     Node tail;

    Dizi ()
    {
        head = null;
        tail = null;
    }
    void insert_toRight(int data)
    {
        Node temp = new Node(data);
        if(head == null)
        {
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }
    void insert_toLeft(int data)
    {
        Node temp = new Node(data);
        if(head == null)
        {
            head = tail = temp;
        }
        else
        {
            temp.next = head;
            head = temp;
        }
    }
    void removeFrom_Left()
    {
        if(head == null)
        {
            System.out.println("Dizi Boş !");
        }
        else if (head == tail)
        {
            head = tail = null;
        }
        else
        {
            head = head.next;
        }
    }


    public void removeFrom_Right()
    {
        if(head == null)
        {
            System.out.println("Dizi boş !");
        } else if (head == tail) {
            head = tail = null;
        }
        else
        {
            Node temp = head;
            Node temp2 = head;
            while (temp.next != null)
            {
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            tail = temp2;
        }
    }
    void yazdir()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }
    int uzunluk()
    {
        int count = 0;
        Node temp = head;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }


}
