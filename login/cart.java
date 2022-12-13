package assess.login;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class cart {

    public static void main(String[] args) {

        List<String> cart = new LinkedList<>();
        Console cons = System.console();
        Boolean stop = false;

        //Read from the console, the result is assigned to a variable
        String name = " ";
        while (name.trim().length() <= 0) {

         name = cons.readLine ("Please login your name...");

       // use equals() for string comparison, == is for numbers
        if (name.equals(name)) {
            System.out.println("Hello " + name + ". Please add items into cart>>>"); }

        while (!stop) {
            // list
            // add <item>
            // delete <num>
            // exit
            String userInput = cons.readLine("> ");
            // command line delimited by space
            userInput = userInput.trim();
            // add apple => ["add", "apple"]
            // list => ["list"]
            userInput = userInput.replaceAll(",", "");
            String[] inputArray = userInput.split(" ");
            String userAction = inputArray[0];


            switch (userAction) {
                case "list":
                    if (cart.size() <= 0) {
                        System.out.println("Your cart is empty!");
                    } else {
                        System.out.println("The contents of your cart:");
                        for (Integer idx = 0; idx < cart.size(); idx++)
                            System.out.printf("%d. %s\n", idx + 1, cart.get(idx));
                    }
                    break;

                case "add": // add apple orange pear
                    // Check if add has any items
                    for (int i = 1; i < inputArray.length; i++) {
                        if (cart.contains(inputArray[i])) {
                            System.out.printf("You have %s in your cart\n", inputArray[i]);
                        } else {
                            cart.add(inputArray[i]);
                            System.out.printf("%s added to cart\n", inputArray[i]);
                        }
                    }
                    break;

                case "remove":
                    // delete has any number and if the number is valid
                    cart.remove(inputArray[1]);
                    System.out.printf("Removed %s from cart\n", inputArray[1]);
                    break;

                case "exit":
                    stop = true;
                    break;

                default:
                    System.err.printf("Unknown command: %s\n", inputArray[0]);
            }
        
        }
        System.out.println("Thank you for shopping with us. Bye bye.");
        }
    }
}



    
