import java.util.Scanner;

/**
 * Created by Refael_Paz on 16/08/2015.
 */
public class Menu
{
    private  RedBlackTree tree;
    public Menu()
    {
        System.out.println("Hello and welcome to the Gift Shop wrap Software!");
        tree = new RedBlackTree();
        this.HandleMenu();
    }

    public void HandleMenu()
    {
        int side,height;
        this.ShowMenu();
        Scanner reader = new Scanner(System.in);
        Scanner box_values = new Scanner(System.in);
        int user_selection = reader.nextInt();
        while (user_selection != 5)
        {
            switch (user_selection)
            {
                case 1:
                    System.out.println("Enter New box side and height: ");
                    side = box_values.nextInt();
                    height = box_values.nextInt();
                    tree.InsertBox(side,height);
                    System.out.println("Box inserted successfully!");
                    break;
                case 2:
                    System.out.println("Enter box side and height to remove: ");
                    side = box_values.nextInt();
                    height = box_values.nextInt();
                    if(tree.RemoveBox(side,height));
                        System.out.println("Box inserted successfully!");
                    break;
                case 3:
                    System.out.println("Enter the box side and height to get the best matching box for you:");
                    side = box_values.nextInt();
                    height = box_values.nextInt();
                    Integer[] result = tree.GetBox(side, height);
                    if (result[0] == null)
                        System.out.println("No matching box in stock!");
                    else
                        System.out.println("The best matching box found in store is:\n Side: " + result[0] + "\n Height: " + result[1]);
                    break;
                case 4:
                    System.out.println("Enter the required box side and height to check for an available box in stock: \n");
                    side = box_values.nextInt();
                    height = box_values.nextInt();
                    if(tree.CheckBox(side,height) == true)
                        System.out.println("Success!");
                    else
                        System.out.println("No matching box exist...");
                    break;
                default:
                    break;
            }
            this.ShowMenu();
            user_selection = reader.nextInt();
        }
        System.out.println("Thanks for using our software :-)");
    }

    public void ShowMenu()
    {
        System.out.println("What would like to do next: ");
        System.out.println("1) Insert a new box");
        System.out.println("2) Remove an existing box");
        System.out.println("3) Get box for a gift");
        System.out.println("4) Check for a box");
        System.out.println("5) Exit");
    }

}
