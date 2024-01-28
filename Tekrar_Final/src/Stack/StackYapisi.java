package Stack;

public class StackYapisi {
    int size;
    int cnt;

    Node top;
    public StackYapisi(int size) {
        this.size = size;
        cnt = 0;
        top = null;
    }

    void push(int data) // ekleme
    {
        Node eleman = new Node(data);
        if(isFull())
        {
            System.out.println("Dolu");
        }
        else
        {
            if(isEmpty())
            {
                top  = eleman;
                System.out.println("eklendi");
            }
            else {
                eleman.next = top;
                top = eleman;
            }
            cnt++;
        }
    }
    void pop() // çıkarma
    {
        if(isEmpty())
        {
            System.out.println("Boş");
        }
        else
        {
            top = top.next;
            cnt--;
        }
    }
    void print()
    {
        if(isEmpty())
        {
            System.out.println("Boş");
        }
        else
        {
            Node temp = top;
            while (temp != null)
            {
                temp = temp.next;
            }
        }
    }
    boolean isFull()
    {
        return cnt == size;
    }

    boolean isEmpty()
    {
        return cnt == 0;
    }
}
