package hackerearth;
import java.util.*;
class Node1
{
    int key;
    Node1 left, right;
 
    public Node1(int item)
    {
        key = item;
        left = right = null;
    }
}
 
class Binary_Traverse
{
    
    Node1 root;
 
    Binary_Traverse()
    {
        root = null;
    }
     void insert(int key) {
        root = insertRec(root, key);
     }
     
    /* A recursive function to insert a new key in BST */
    Node1 insertRec(Node1 root, int key) {
 
        /* If the tree is empty, return a new Node1 */
        if (root == null) {
            root = new Node1(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) Node1 pointer */
        return root;
    }
 

    /* Given a binary tree, print its Node1s according to the
      "bottom-up" postorder traversal. */
    void printPostorder(Node1 Node1)
    {
        if (Node1 == null)
            return;
 
        // first recur on left subtree
        printPostorder(Node1.left);
 
        // then recur on right subtree
        printPostorder(Node1.right);
 
        // now deal with the Node1
        System.out.print(Node1.key + " ");
    }
 
    /* Given a binary tree, print its Node1s in inorder*/
    void printInorder(Node1 Node1)
    {
        if (Node1 == null)
            return;
 
        /* first recur on left child */
        printInorder(Node1.left);
 
        /* then print the data of Node1 */
        System.out.print(Node1.key + " ");
 
        /* now recur on right child */
        printInorder(Node1.right);
    }
 
    /* Given a binary tree, print its Node1s in preorder*/
    void printPreorder(Node1 Node1)
    {
        if (Node1 == null)
            return;
 
        /* first print data of Node1 */
        System.out.println(Node1.key + " ");
 
        /* then recur on left sutree */
        printPreorder(Node1.left);
 
        /* now recur on right subtree */
        printPreorder(Node1.right);
    }
   public Node1 search(Node1 root, int key)
{
    // Base Cases: root is null or key is present at root
    if (root==null || root.key==key)
        return root;
 
    // val is greater than root's key
    if (root.key > key)
        return search(root.left, key);
 
    // val is less than root's key
    return search(root.right, key);
}
 
    // Wrappers over above recursive functions
    void printPostorder()  {     printPostorder(root);  }
    void printInorder()    {     printInorder(root);   }
    void printPreorder()   {     printPreorder(root);  }
 
    // Driver method
    public static void main(String[] args)
    {
        Binary_Traverse tree = new Binary_Traverse();
        // tree.root = new Node1(1);
        // tree.root.left = new Node1(2);
        // tree.root.right = new Node1(3);
        // tree.root.left.left = new Node1(4);
        // tree.root.left.right = new Node1(5);
        tree.root = null;
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        for(int j=0; j<n; j++){
          int k = scan.nextInt();
          tree.insert(k);

       }
       Node1 pre = tree.search(tree.root,scan.nextInt());

 
        //System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder(pre);
 
        // System.out.println("\nInorder traversal of binary tree is ");
        // tree.printInorder();
 
        // System.out.println("\nPostorder traversal of binary tree is ");
        // tree.printPostorder();
    }
}

