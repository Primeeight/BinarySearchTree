import java.util.*;
import java.io.*;


public class TestBinarySearchTree {

    public static void main(String[] args) {

        Integer[] num = {67, 87, 55, 43, 48, 73, 91, 39, 59, 92, 34, 95, 81, 66, 40, 53, 84, 77};
        // Create an empty BinaryTree
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(num);

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter an element to search");
        Integer key = input.nextInt();
        if(tree.search(key)) {
            System.out.println("\nThe element " + key +" was found.");
        }else
            System.out.println("\nThe element " +key + " was not found.");


        System.out.println("\nEnter an element to delete");
        key = input.nextInt();
        if(tree.delete(key)) {
            System.out.println("\nThe element " + key +" was found and deleted.");
        }else
            System.out.println("\nThe element " + key + " was not found.");
        //complete the code as suggested in the Lab document.
        /**
         * Complete TestBinarySearchTree program to test the following methods
         *
         * search
         * insert
         * delete
         * inorder
         * preorder
         * postorder
         * path
         * leftSubTree
         * rightSubTree
         * getNumberOfLeaves
         * inorderPredecessor
         */
        //g
        System.out.println("\nEnter an element to insert");
        key = input.nextInt();
        tree.insert(key);

        System.out.println("\nEnter an element to path to");
        key = input.nextInt();
        System.out.println("\nThe path to the specified element is " + tree.path(key));

        System.out.println("\nEnter an element to check for the right subtree of");
        key = input.nextInt();
        System.out.println("\nThe right sub tree of " + key + " is " + tree.rightSubTree(key) + " in pre-order");

        System.out.println("\nEnter an element to check for the left subtree of");
        key = input.nextInt();
        System.out.println("\nThe left sub tree of " + key + " is " + tree.leftSubTree(key) + " in pre-order");

        System.out.println("\nEnter an element to check for the predecessor");
        key = input.nextInt();
        tree.inorderPredecessor(key);

        tree.getNumberOfLeaves();

        System.out.println("\nThese are the elements in order:");
        tree.inorder();
        System.out.println("\nThese are the elements in pre-order:");
        tree.preorder();
        System.out.println("\nThese are the elements in post-order:");
        tree.postorder();

    }
}
