import java.util.Scanner;

/** Author: Simon Cordero.
 * Last Updated: 2020/02/18
 */

public class Einstein {
  /**
   * This program finds e in e=mc^2 with m as the input.
   */
   
  public static void main(String[] args) {

    System.out.println("Enter a mass in kg.");
    final double lightspeed = 2.998 * Math.pow(10,8);
    Scanner wordScanner = new Scanner(System.in);
    
    final double mass = wordScanner.nextDouble();
    final double energy = (mass * Math.pow(lightspeed,2));
  
    System.out.println("A mass of " + mass + " will release " + energy + " Joules of energy.");
   
  }
  
}