import java.util.*;


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

        System.out.println("\nEnter an element to check for the predecessor ");
        key = input.nextInt();
        System.out.println("\nThe in order predecessor of " + key + " is " + tree.inorderPredecessor(key) + " in pre-order");

        System.out.println("\nThe number of leaf nodes is " + tree.getNumberOfLeaves());

        System.out.println("\nThese are the elements in order:");
        tree.inorder();
        System.out.println("\nThese are the elements in pre-order:");
        tree.preorder();
        System.out.println("\nThese are the elements in post-order:");
        tree.postorder();

    }
}
/**
 * "C:\Program Files\Java\jdk1.8.0_111\bin\java.exe" "-javaagent:C:\Users\Zach's PC\AppData\Local\JetBrains\Toolbox\apps\IDEA-U\ch-0\223.7571.182\lib\idea_rt.jar=49766:C:\Users\Zach's PC\AppData\Local\JetBrains\Toolbox\apps\IDEA-U\ch-0\223.7571.182\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_111\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_111\jre\lib\rt.jar;C:\Users\Zach's PC\IdeaProjects\Project 9\out\production\Project 9" TestBinarySearchTree
 *
 * Enter an element to search
 * 35
 *
 * The element 35 was not found.
 *
 * Enter an element to delete
 * 34
 *
 * The element 34 was found and deleted.
 *
 * Enter an element to insert
 * 35
 *
 * Enter an element to path to
 * 35
 *
 * The path to the specified element is [67, 55, 43, 39]
 *
 * Enter an element to check for the right subtree of
 * 55
 *
 * The right sub tree of 55 is [59, 66] in pre-order
 *
 * Enter an element to check for the left subtree of
 * 88
 *
 * The left sub tree of 88 is [] in pre-order
 *
 * Enter an element to check for the predecessor
 * 66
 *
 * The in order predecessor of 66 is 59 in pre-order
 *
 * The number of leaf nodes is 7
 *
 * These are the elements in order:
 * 35 39 40 43 48 53 55 59 66 67 73 77 81 84 87 91 92 95
 * These are the elements in pre-order:
 * 67 55 43 39 35 40 48 53 59 66 87 73 81 77 84 91 92 95
 * These are the elements in post-order:
 * 35 40 39 53 48 43 66 59 55 77 84 81 73 95 92 91 87 67
 * Process finished with exit code 0
 */