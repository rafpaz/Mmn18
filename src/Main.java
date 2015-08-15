/**
 * Created by Refael_Paz on 25/07/2015.
 */
public class Main
{
    public static void main(String[] args)
    {
        RedBlackTree tree = new RedBlackTree();
        tree.InsertBox(5,3);
        tree.InsertBox(5,4);
        tree.InsertBox(5,5);
        tree.InsertBox(5,5);
        tree.InsertBox(6,5);
        tree.InsertBox(7,3);
        tree.InsertBox(9, 2);
        System.out.print(tree.TreeSuccessor(tree.getNode(9)).getKey());



//        RedBlackTree tree = new RedBlackTree();
//        tree.put(1, 1);
//        tree.put(2,2);
//        boolean test = tree.contains(2);
//
//        Comparable key = 1;
//        tree.getNode(key).getInnerTree().put(3,3);
//        tree.getNode(key).getInnerTree().put(2,2);
//        tree.getNode(key).getInnerTree().contains(3);

//        tree.select(1);
//        tree.put(3,3);
//        tree.put(4,4);
//        tree.put(5,5);
//        tree.printStructure();
        //testing
    }
}
