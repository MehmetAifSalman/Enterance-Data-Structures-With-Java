package BST;

public class Agac {
    Node root;
    Agac()
    {
        root = null;
    }

    public Node Insert(Node root , int data)
    {
        if(root != null)
        {
            if( data < root.data)
            {
                root.left = Insert(root.left , data);
            }
            else
            {
                root.right = Insert(root.right , data);
            }
        }
        else
        {
            root = new Node(data);
        }
        return root;
    }
    void preorder(Node root)
    {
        if(root != null)
        {
            System.out.println(root.data);
            preorder(root.right);
            preorder(root.left);
        }

    }

    public int heihgt(Node root)
    {
        if(root == null)
        {
            return -1;
        }
        else
        {
            int sag,sol;
            sag = heihgt(root.right);
            sol = heihgt(root.left);
            if(sag > sol)
            {
                return sag + 1;
            }
            else
            {
                return sol + 1;
            }
        }
    }
    int size(Node root)
    {
        if(root == null)
            return 0;
        else
            return size(root.left) + 1 + size(root.right);

    }
}
