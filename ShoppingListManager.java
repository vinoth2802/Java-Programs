import java.util.Scanner;
import java.util.Vector;

public class ShoppingListManager {
    public static void main(String[] args) {
        Vector<String> shoppingList = new Vector<>();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\nShopping List Manager");
            System.out.println("1. Add Item to Shopping List");
            System.out.println("2. View Shopping List");
            System.out.println("3. Remove Item from Shopping List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add to the shopping list: ");
                    String item = s.next();
                    shoppingList.add(item);
                    System.out.println(item + " added to the shopping list.");
                    break;
                case 2:
                    if (shoppingList.isEmpty()) {
                        System.out.println("Shopping list is empty.");
                    } else {
                        System.out.println("Shopping List:");
                        for (String listItem : shoppingList) {
                            System.out.println("- " + listItem);
                        }
                    }
                    break;
                case 3:
                    if (shoppingList.isEmpty()) {
                        System.out.println("Shopping list is empty");
                        break;
                    }

                    System.out.println("Select an item number to remove:");
                    for (int i = 0; i < shoppingList.size(); i++) {
                        System.out.println((i + 1) + ". " + shoppingList.get(i));
                    }

                    int removeChoice = s.nextInt();
                    if (removeChoice >= 1 && removeChoice <= shoppingList.size()) {
                        String removedItem = shoppingList.remove(removeChoice - 1);
                        System.out.println(removedItem + " removed from the shopping list.");
                    } else {
                        System.out.println("Invalid choice");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    s.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
