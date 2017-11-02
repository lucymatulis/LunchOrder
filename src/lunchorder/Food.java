/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lunchorder;
import java.text.NumberFormat;
/**
 * Food Class
 * @author lumat8093
 */
public class Food {
        private int numFries, numBurgs, numSalad, numSodas;
	private double total,moneyPaid;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        /**
	 * constructor
	 * pre: none
	 * post: An order is placed. Number of each items is initialized.
	 */
        public Food(int f, int b, int s, int p,double mp){
            numFries = f;
            numBurgs = b;
            numSalad = s;
            numSodas = p;
            moneyPaid = mp;
            
        }
        /** 
	 * Returns the information about fries.
	 * pre: none
	 * post: The fries information has been returned.
	 */
        public String fries(){
            double fries  [] ={1.3,11,36,4};
            double cost = (2*fries[0]);
            total+=cost;
            return "Cost of fries is "+money.format(cost)+", fat in fries is "+fries[1]+"g, carbs in fries is "+fries[2]+"g, fibre in fries is "+fries[3]+"g";
       } 
        /** 
	 * Returns the information about burgs.
	 * pre: none
	 * post: The burgs information has been returned.
	 */
        public String burgs(){
            double burgs  [] ={1.85,9,33,1};
            double cost= 2*burgs[0];
            total+=cost;
            return "Cost of burgers is "+money.format(cost)+", fat in fries is "+burgs[1]+"g, carbs in fries is "+burgs[2]+"g, fibre in fries is "+burgs[3]+"g";
       } 
        /** 
	 * Returns the information about salads.
	 * pre: none
	 * post: The salads information has been returned.
	 */
        public String salads(){
            double salads  [] ={2.00,1,11,5};
            double cost = (2*salads[0]);
            total+=cost;
            return "Cost of salads is "+money.format(cost)+", fat in fries is "+salads[1]+"g, carbs in fries is "+salads[2]+"g, fibre in fries is "+salads[3]+"g";
       } 
        /** 
	 * Returns the information about sodas.
	 * pre: none
	 * post: The soda information has been returned.
	 */
        public String sodas(){
            double sodas  [] ={0.95,0,38,0};
            double cost = (2*sodas[0]);
            total+=cost;
            return "Cost of sodas is "+money.format(cost)+", fat in fries is "+sodas[1]+"g, carbs in fries is "+sodas[2]+"g, fibre in fries is "+sodas[3]+"g";
       }
        /** 
	 * Returns the cost.
	 * pre: none
	 * post: The cost has been returned.
	 */
        public String getCost(){
            return money.format(total);
        }
        /** 
	 * Returns the change.
	 * pre: none
	 * post: The change has been returned.
	 */
        public String change(){
            double change = moneyPaid-total;
            String x = money.format(change);
            return x;
        }
        /** 
	 * No Return.
	 * pre: none
	 * post: creates string for change information.
	 */
        public void getChange(){
            System.out.println("You change comes to: "+change());
        }
     
}
