/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;

/**
 *This class describes the number of orders of each item and stores it as a single order
 * 
 * @author anurag
 */
public class BurgerOrder {
    
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 7;
    /**
     * This method takes in the number of orders for each item
     * 
     * @param numHamburgers integer to store number of hamburgers
     * @param numCheeseburgers integer to store number of cheeseburgers
     * @param numVeggieburgers integer to store number of veggieburgers
     * @param numSodas integer to store number of sodas
     * @param orderToGo Boolean to store if order is to go or not
     * @param orderNum integer to store order number
     */
    public BurgerOrder (int numHamburgers, int numCheeseburgers, int numVeggieburgers, int numSodas, boolean orderToGo, int orderNum){
        this.numHamburgers = numHamburgers;
        this.numCheeseburgers = numCheeseburgers;
        this.numVeggieburgers = numVeggieburgers;
        this.numSodas = numSodas;
        this.orderToGo = orderToGo;
        this.orderNum = orderNum;
    }
    /**
     * This method is to get the number of hamburger orders
     * 
     * @return number of hamburger orders
     */
    public int getnumHamburgers(){
    return numHamburgers;
    } 
    /**
     * This method is to set the number of hamburger orders 
     * 
     * @param numHamburgers integer to store number of hamburger orders given by user
     */
    public void setNumHamburgers(int numHamburgers){
        this.numHamburgers = numHamburgers;
    }
    /**
     * This method is to get the number of cheeseburger orders
     * 
     * @return number of cheeseburger orders
     */
    public int getnumCheeseburgers(){
       return numCheeseburgers; 
    }
    /**
     * This method is to set the number of cheeseburger orders
     * 
     * @param numCheeseburgers integer to store number of cheeseburger orders given by user
     */
    public void setNumCheeseburgers(int numCheeseburgers){
        this.numCheeseburgers = numCheeseburgers;
    }
    /**
     * This method is to get the number of veggieburger orders
     * 
     * @return number of veggieburger orders
     */
    public int getnumVeggieburgers(){
       return numVeggieburgers; 
    }
    /**
     * This method is to set the number of veggieburger orders
     * 
     * @param numVeggieburgers integer to store number of veggieburger orders given by user
     */
    public void setNumVeggieburgers(int numVeggieburgers){
        this.numVeggieburgers = numVeggieburgers;
    }
    /**
     * This method is to get the number of soda orders
     * 
     * @return number of soda orders
     */
    public int getnumSodas(){
       return numSodas; 
    }
    /**
     * This method is to set the number of soda orders
     * 
     * @param numSodas integer to store number of soda orders given by user
     */
    public void setNumSodas(int numSodas){
        this.numSodas = numSodas;
    }
    /**
     * This method is used to determine if the order is to go or not
     * 
     * @return true or false if the order is to go
     */
    public boolean isOrderToGo(){
        return orderToGo;
    }
    /**
     * This method is used to set the given Boolean value
     * 
     * @param orderToGo Boolean if the order is to go or not
     */
    public void setOrderToGO(boolean orderToGo){
        this.orderToGo = orderToGo;
    }
    /**
     * This method is to get the number for overall order
     * 
     * @return the specific number for the order number
     */
    public int getOrderNum() {
        return orderNum;
    }/**
     * This method is to set the number for overall order given by user
     * 
     * @param orderNum integer to store number for order num. 
     */
    public void setOrderNum(int orderNum){
        this.orderNum = orderNum;
    }

    
    
    
    
    
    
}
