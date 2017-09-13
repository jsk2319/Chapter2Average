/**
 * @author jsk2319@email.vccs.edu
 *Author Jude Kallista-Fitzpatrick
 * Date: 9/12/2017
 * Description: This program takes 10 numbers from user input and averages them.
*/

import java.util.Scanner; //adds scanner utility

public class Average {
    public static void main(String[] args) {

      String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10; //sets each number variable
      Scanner keyboard = new Scanner(System.in);
      keyboard.useDelimiter(","); //makes comma delimiter

      System.out.println("Enter 10 numbers spearated by a comma and I will find their average. ");//Lets user know what to do

      //lets user enter 10 numbers of their choosing
      s1 = keyboard.next();
      s2 = keyboard.next();
      s3 = keyboard.next();
      s4 = keyboard.next();
      s5 = keyboard.next();
      s6 = keyboard.next();
      s7 = keyboard.next();
      s8 = keyboard.next();
      s9 = keyboard.next();
      s10 = keyboard.next();

      System.out.println("You entered "+1+""+2+""+3+""+4+""+5+""+6+""+7+""+8+""+9+""+10+"");//shows numbers entered
      System.out.println("\n");//spaces out the numbers typed and the average

      int sum = (1+2+3+4+5+6+7+8+9+10); //adds numbers to prepare for average
      int average = sum/10; //takes the sum and divides it by 10 to average it

      System.out.println(" The average is " + average ); //displays results
    }
}