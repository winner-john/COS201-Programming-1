import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter item name: Drinks");
        String itemName = input.nextLine();
        
        System.out.print("Enter price per item:500 ");
        double price = input.nextDouble();
        
        System.out.print("Enter quantity:12 ");
        int quantity = input.nextInt();
        
        double totalCost = price * quantity;
        
        System.out.println("\n--- PURCHASE DETAILS ---");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Cost: $%.2f%n", totalCost);
    }
}
