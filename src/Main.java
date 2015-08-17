import java.util.Scanner;

/**
 * Created by Refael_Paz on 25/07/2015.
 */
public class Main
{
    public static void main(String[] args)
    {
        TestRun1();
        TestRun2();
    }

    public static void TestRun1()
    {
        RedBlackTree tree = new RedBlackTree();

        tree.InsertBox(1,1);
        tree.InsertBox(2,2);
        tree.InsertBox(3,3);
        tree.InsertBox(4,4);
        tree.InsertBox(5,5);
        tree.InsertBox(6,6);
        tree.InsertBox(7,7);
        tree.InsertBox(8,8);
        tree.InsertBox(9,9);
        tree.InsertBox(10,10);
        tree.InsertBox(11,11);
        tree.InsertBox(12,12);
        tree.InsertBox(13,13);
        tree.InsertBox(14,14);
        tree.InsertBox(15, 15);
        tree.InsertBox(16,16);
        tree.InsertBox(17,17);
        tree.InsertBox(18,18);
        tree.InsertBox(19, 19);
        tree.InsertBox(20, 20);
        Integer[] result = tree.GetBox(14, 15);
        System.out.println("The best matching box found in store is:\n Side: " + result[0] + "\n Height: " + result[1]);
        tree.RemoveBox(15, 15);
        result = tree.GetBox(15, 15);
        System.out.println("The best matching box found in store is:\n Side: " + result[0] + "\n Height: " + result[1]);
    }

    public static void TestRun2()
    {
        RedBlackTree tree = new RedBlackTree();
        tree.InsertBox(1,20);
        tree.InsertBox(2,19);
        tree.InsertBox(3,18);
        tree.InsertBox(1,17);
        tree.InsertBox(5,16);
        tree.InsertBox(6,15);
        tree.InsertBox(3,14);
        tree.InsertBox(3,13);
        tree.InsertBox(9,12);
        tree.InsertBox(10,11);
        tree.InsertBox(11,10);
        tree.InsertBox(12,9);
        tree.InsertBox(13,8);
        tree.InsertBox(15,7);
        tree.InsertBox(15,6);
        tree.InsertBox(16,5);
        tree.InsertBox(2,4);
        tree.InsertBox(18,3);
        tree.InsertBox(19,2);
        tree.InsertBox(20,1);

        Integer[] result = tree.GetBox(12, 8);
        System.out.println("The best matching box found in store is:\n Side: " + result[0] + "\n Height: " + result[1]);
        tree.RemoveBox(15, 15);
        result = tree.GetBox(15, 15);
    }
}
