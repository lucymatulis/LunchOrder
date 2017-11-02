 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lunchorder;

import java.util.Scanner;
/**
 * A fast food restaurant where orders can be places and customers can 
 * see order information.
 */
/**
 *
 * @author lumat8093
 */
public class LunchOrder {

    
    public static void main(String[] args) {
        int numFries, numBurgs, numSalads, numSodas, moneyPaid;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter number of fries:");
        numFries = input.nextInt();
        System.out.println("Enter number of burgers:");
        numBurgs = input.nextInt();
        System.out.println("Enter number of salads:");
        numSalads = input.nextInt();
        System.out.println("Enter number of sodas:");
        numSodas = input.nextInt();
        System.out.println("Enter number of money paid:");
        moneyPaid = input.nextInt();
        
        Food order = new Food(numFries, numBurgs, numSalads,numSodas, moneyPaid);
        
        System.out.println(order.fries());
        System.out.println(order.burgs());
        System.out.println(order.salads());
        System.out.println(order.sodas());
        System.out.println("Your order comes to: "+order.getCost());
        order.getChange();
    }
    
}
