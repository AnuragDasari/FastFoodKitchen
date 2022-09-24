/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;
import java.util.ArrayList;
import java.util.List;

/**
 *This class describes the list of orders.
 * @author anurag
 */
public class FastFoodKitchen {
    //Array list for orders
    private List<BurgerOrder>orderList= new ArrayList<>();
    //Integer valiable nextOrderNum
    private static int nextOrderNum;

    /**
     *Gets next order number
     * 
     * @return order number
     */
    public static int getnextOrderNum(){
        return nextOrderNum;
    }
    /**
     *This method makes sure that no order has the same order id. 
     * 
     */
    private static void incrementNextOrderNum(){
        nextOrderNum++;
    }
        /**
         * A constructor to populate orderList with initial set of three orders.
         * 
         */
    public FastFoodKitchen() {
        orderList.add(new BurgerOrder(3, 5, 4, 10, false, getnextOrderNum()));
        incrementNextOrderNum();

        orderList.add(new BurgerOrder(0, 0, 3, 3, true, getnextOrderNum()));
        incrementNextOrderNum();

        orderList.add(new BurgerOrder(1, 1, 0, 2, false, getnextOrderNum()));
        incrementNextOrderNum();
    }
    /**
     * This method creates a new order
     * 
     * @param ham integer for hamburger
     * @param cheese integer for cheeseburger
     * @param veggie integer for veggieburger
     * @param soda integer for soda
     * @param toGo Boolean if the order is to go
     * @return order number created
     */
      public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo){
        orderList.add(new BurgerOrder(ham, cheese, veggie, soda, toGo, getnextOrderNum()));
        incrementNextOrderNum();
        return getnextOrderNum();
    }
      /**
       * This method cancels the previous order
       * 
       * @return if true then return canceled by decrementing. else return empty list
       */
    public boolean cancelLastOrder(){
        if (orderList.size() > 0){
            orderList.remove(orderList.size()-1);
            nextOrderNum--;
            return true;
        }
        else{
            return false;
        }
    }
        /**
         * This method shows the pending orders
         * 
         * @return remaining orders in orderList
         */
    public int getNumOrdersPending(){
        return orderList.size();
    }

    /**
     *This method shows the status of the order
     * 
     * @param statusOrder integer for storing the required order number
     * @return if false return the status. else returns empty list
     */
    public boolean isOrderDone(int statusOrder){
    for (int i=0; i<orderList.size(); i++)
    {
        if(statusOrder == orderList.get(i).getOrderNum()){
        return false;
    }
}
    return true;
    }

    /**
     *This method cancels a specific order
     * @param cancelOrder integer for storing the required order number
     * @return if true then cancels the order. else returns empty list
     */
    public boolean cancelOrder(int cancelOrder) {
        for (int i=0; i<orderList.size(); i++)
        {
            if(cancelOrder == orderList.get(i).getOrderNum()){
            orderList.remove(i);
            return true;
        }
    }
        return false;
    }
}
