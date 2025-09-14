/**
 * Name: Janelle Page
 * Date: 9/13/25
* Purpose: InClass 3 - 
*Finding cube volume and surface area
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;
public class InClass3_Janelle_Page
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.print("Please enter the length of the sde of the cube:");
        // Step 2: Read the user's input and store it in a variable.
        double side =input.nextDouble();
        // Step 3: Use an appropriate method to determine the volume of the cube.
        double volume = Math.pow(side, 3);
        // Step 4: Use an appropriate method to determine the surface area of the cube.
        double surfacearea = 6 * Math.pow(side, 2);
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
    
        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("The volume of the cube is " + volume);
        System.out.println("The surface area of the cube is " + surfacearea);
        input.close();
    }
}