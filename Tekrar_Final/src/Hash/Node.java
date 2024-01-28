package Hash;

public class Node {
    Node next;
    int key;
    String data;
    Node(){

        next = null;
    }

    public Node(int key , String data) {
        this.key = key;
        this.data = data;
    }
}
