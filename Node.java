/**
 * props: http://cslibrary.stanford.edu/110/BinaryTrees.html#java
 */
public class Node
{
    Node left;
    Node right;
    int data;

    // constructor
    Node(int newData)
    {
        left = null;
        right = null;
        data = newData;
    }

    // overwriting toString for debug's sake
    @Override public String toString() {
        return "" + data;
    }

    public static void depth_first_traversal(Node n)
    {
        if (n != null)
        {
            System.out.println(n);
            if (n.left != null)
            {
                depth_first_traversal(n.left);
            }
            if (n.right != null)
            {
                depth_first_traversal(n.right);
            }
        }
    }
}