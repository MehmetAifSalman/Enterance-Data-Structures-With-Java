package Queue;

public class MyQueue {
    Node front;
    Node rear;
    int count;
    int size;
    MyQueue(int size)
    {
        front = rear = null;
        count = 0;
        this.size = size;
    }

    void enQueue(int data)
    {
        if(IsFull())
        {
            System.out.println("Kuyruk dolu");
        }
        else
        {
            Node temp = new Node(data);
            if(IsEmpty())
            {
                front = rear = temp;
            }
            else
            {
                temp.next = front;
                front = temp;
            }
        }

    }
    void deQueue(int data)
    {
        if(IsFull())
        {
            System.out.println("Kuyruk dolu");
        }
        else
        {
            Node temp = new Node(data);
            if(IsEmpty())
            {
                front = rear = temp;
            }
            else
            {
               rear.next = temp;
               rear = temp;
            }
        }

    }

    boolean IsFull()
    {
        return size == count;
    }
    boolean IsEmpty()
    {
        return count == 0;
    }
}
