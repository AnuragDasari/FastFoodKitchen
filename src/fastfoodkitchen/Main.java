/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fastfoodkitchen;

import java.util.Scanner;

/**
 *This class is the Main class for FastFoodKitchen program
 * 
 * @author anurag
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //PART A      
//        BurgerOrder order1 = new BurgerOrder (3, 5, 4, 10, true, 1);
//        BurgerOrder order2 = new BurgerOrder (0, 0, 3, 3, false, 2);
//        BurgerOrder order3 = new BurgerOrder (1, 1, 0, 2, false, 3);
//        order1.setNumSodas(12);
//        order2.setNumHamburgers(5);
//        System.out.println(
//                "BurgerOrder{" + "numHamburgers=" + order1.getnumHamburgers() + ", numCheeseburgers="
//                + order1.getnumCheeseburgers() + " , numVeggieburgers=" + order1.getnumVeggieburgers() 
//                +" , numSodas" +order1.getnumSodas() + " , orderToGo=" + order1.isOrderToGo() 
//                +" , orderNum=" + order1.getorderNum() + '}');
//        System.out.println(
//                "BurgerOrder{" + "numHamburgers=" + order2.getnumHamburgers() + ", numCheeseburgers="
//                + order2.getnumCheeseburgers() + " , numVeggieburgers=" + order2.getnumVeggieburgers() 
//                +" , numSodas" +order2.getnumSodas() + " , orderToGo=" + order2.isOrderToGo() 
//                +" , orderNum=" + order2.getorderNum() + '}');
//        System.out.println(
//                "BurgerOrder{" + "numHamburgers=" + order1.getnumHamburgers() + ", numCheeseburgers="
//                + order3.getnumCheeseburgers() + " , numVeggieburgers=" + order3.getnumVeggieburgers() 
//                +" , numSodas" +order3.getnumSodas() + " , orderToGo=" + order3.isOrderToGo() 
//                +" , orderNum=" + order3.getorderNum() + '}');
 //PART B
     FastFoodKitchen kitchen = new FastFoodKitchen();
Scanner sc = new Scanner(System.in);

while (kitchen.getNumOrdersPending() != 0) {
    // see what the user wants to do
    System.out.println("Please select from the following menu of options, by typing a number:");
    System.out.println("\t 1. Order food");
    System.out.println("\t 2. Cancel last order");
    System.out.println("\t 3. Show number of orders currently pending.");
    System.out.println("\t 4. Exit");
    System.out.println("\t 5. Check status on order");
    System.out.println("\t 6. Cancel a specific order");
    int num = sc.nextInt();
    switch (num) {

        case 1:
            System.out.println("How many hamburgers do you want?");
            int ham = sc.nextInt();
            System.out.println("How many cheeseburgers do you want?");
            int cheese = sc.nextInt();
            System.out.println("How many veggieburgers do you want?");
            int veggie = sc.nextInt();
            System.out.println("How many sodas do you want?");
            int sodas = sc.nextInt();
            System.out.println("Is your order to go? (Y/N)");
            char letter = sc.next().charAt(0);
            boolean TOGO = false;
            if (letter == 'Y' || letter == 'y') {
                TOGO = true;
            }
            int orderNum = kitchen.addOrder(ham, cheese, veggie, sodas, TOGO);
            System.out.println("Thank-you. Your order number is " + orderNum);
            System.out.println();
            break;
        case 2:
            boolean cancel = kitchen.cancelLastOrder();
            if (cancel) {
                System.out.println("Thank you. The last order has been canceled");
            } else {
                System.out.println("Sorry. There are no orders to cancel.");
            }
            System.out.println();
            break;
        case 3:
            System.out.println("There are " + kitchen.getNumOrdersPending() + " pending orders");
            break;
        case 4:
            System.exit(0);
            break;
            default:
            System.out.println("Sorry, but you need to enter a 1, 2, 3 or a 4");
        case 5:
            System.out.println("Enter the order number for the order you want to check:");
            int statusOrder = sc.nextInt();
            boolean status = kitchen.isOrderDone(statusOrder);
            if(status == true){
                System.out.println("No order was found");
            }
            else{
                System.out.println("Your order in being prepared");
            }
            break;
        case 6:
            System.out.println("Enter the order number for the order you want to cancel:");
            int cancelOrder = sc.nextInt();
            boolean select = kitchen.cancelOrder(cancelOrder);
            if(select == true){
                System.out.println("Your order has been sucessfully cancelled");
            }
            else{
                System.out.println("Sorry, we can’t find your order number in the system");
            }
            break;    
            }
    }

} // end while loop   
    }
    

