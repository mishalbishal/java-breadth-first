import java.util.*;

class Main
{
    static boolean debug = false;
    public static void main(String args[])
    {
        // make a binary tree
        Node root = new Node(5);
        for (int i = 2; i < 9; i++)
        {
            insert(root, i);
        }
        if (debug)
            Node.depth_first_traversal(root); // making sure that things are being inserted

        // print the binary tree
        breadthFirstPrint(root);
        // rejoice! :)
        System.out.println("Rejoice :)");
    }

    public static void breadthFirstPrint(Node n)
    {
        List<Node> currentBreadth = new ArrayList<Node>();
        List<Node> nextBreadth = new ArrayList<Node>();
        currentBreadth.add(n);
        while(currentBreadth.size() > 0)
        {
            Iterator<Node> itr = currentBreadth.iterator();
            while(itr.hasNext())
            {
                Node temp = itr.next();
                System.out.println(temp);
                if(temp.left != null)
                    nextBreadth.add(temp.left);
                if(temp.right != null)
                    nextBreadth.add(temp.right);
            }
            currentBreadth = nextBreadth;
            nextBreadth = new ArrayList<Node>(); // reset the new list, garbage collector handles the rest
            System.out.println("Next Breadth");
        }
    }

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