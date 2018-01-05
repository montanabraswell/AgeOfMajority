/* Montana Braswell
 * MOOC Exercise
 * Java Tutorial 15
 * 01/05/2018
 */
package ageofmajority;



import java.util.Scanner;
public class AgeOfMajority {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        //creating variable to scan in to the user;
        System.out.println("How old are you?: ");
        int age = Integer.parseInt(reader.nextLine());
        
        int number = 18;
        // If statement to determine if the number the user chose fits the parameter
        if (number <= 18){
            System.out.println(" You have not reached the age of majority yet!");
        }else{
            System.out.println("You have reached the age of majority!");
        }
        // Second number being sent through the user through the parameters
            System.out.println("How old are you?:");
            int age2 = Integer.parseInt(reader.nextLine());
        
            if (number <= 21){
            System.out.println("You have reached the age of majority!");
            }
            else{
            System.out.println("You have not reached the age of majority yet");
        } 
        
    }
    
    
    
}
