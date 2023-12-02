package BST_AGAIN;

public class Tree {

    Node root;
    Tree()
    {
        this.root = null;
    }

    Node insert(Node root , int data)
    {
        if (root != null)
        {
            if(root.data > data)
            {
                root.left = insert(root , data);
            }
            else
            {
                root.right = insert(root , data);
            }


        }
        else
        {
            root = new Node(data);
        }
        return root;
    }
    void inOrder(Node root)
    {
        if(root != null)
        {
            inOrder(root.left);
            System.out.println(root.data + " ");
            inOrder(root.left);
        }
    }

    Node delete(Node root , int x)
    {
        Node t1,t2;
        if(root == null)
        {
            return null;
        }
        if(root.data == x)
        {
            if(root.left == root.right)
            {
                root = null;
            }
            else if(root.left == null)
            {
                t1 = root.right;
                return t1;
            }
            else if(root.right == null)
            {
                t1 = root.left;
                return t1;
            }
            else
            {
                t1 = t2 = root.right;
                while (t1.left != null)
                {
                    t1 = t2.left;
                }
                t1.left = root.left;
                return t2;
            }
        }
        else
        {
            if(x < root.data)
            {
                root.left = delete(root.left , x );
            }
            else{
                root.right = delete(root.right , x);
            }
        }
        return root;
    }
}
