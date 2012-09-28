import java.util.*;

class Main
{
    static boolean debug = true;
    public static void main(String args[])
    {
        // make a binary tree
        Node root = new Node(1);
        for (int i = 2; i < 9; i++)
        {
            insert(root, i);
        }
        if (debug)
            Node.depth_first_traversal(root); // making sure that things are being inserted

        // print the binary tree
        // binaryPrint(root);
        // rejoice! :)
    }

    // public static void binaryPrint(Node n)
    // {
    //     List<Node> currentBreadth = new ArrayList<Node>();
    //     currentBreadth.add(n);
    // }

    /**
     * props again: http://cslibrary.stanford.edu/110/BinaryTrees.html#java
     */
    public static Node insert(Node node, int data)
    {
        if (node == null)
        {
            node = new Node(data);
        }
        else
        {
            if (data <= node.data)
            {
                node.left = insert(node.left, data);
            }
            else
            {
                node.right = insert(node.right, data);
            }
        }

        return node;
    }


}