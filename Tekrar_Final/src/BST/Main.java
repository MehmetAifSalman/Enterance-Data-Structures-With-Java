package BST;

public class Main {

    public static void main(String[] args) {
        Agac agac = new Agac();
        agac.root = agac.Insert(agac.root , 12);
        agac.root = agac.Insert(agac.root , 11);
        agac.root = agac.Insert(agac.root , 13);
        agac.root = agac.Insert(agac.root , 14);
        agac.root = agac.Insert(agac.root , 9);
        agac.root = agac.Insert(agac.root , 17);
        agac.preorder(agac.root);
        System.out.println(agac.size(agac.root));
        System.out.println(agac.size(agac.root));
    }
}
