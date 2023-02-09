/**
 * Class: Triangle
 * Author: William Chokbengboune
 * Written: 2/9/2023
 * Version: 1.0
 * Description: This program checks if any 2 added sides of a triangle are greater one size.
 * If the 2 sides are not greater than, it is not a triangle.
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of edge a: ");
        double lengthA = in.nextDouble();
        System.out.println("Enter the length of edge B: ");
        double lengthB = in.nextDouble();
        System.out.println("Enter the length of edge C: ");
        double lengthC = in.nextDouble();
        if (lengthA + lengthB > lengthC){
            if (lengthB + lengthC > lengthA){
                if (lengthA + lengthC > lengthB){
                    System.out.println("valid");
                    //if any 2 sides added aare greater than the remaining side then it is valid
                }
                else{
                    System.out.println("Invalid input");
                    //Only works if perimeter of a and c is greater than b
                }
            }
            else{
                System.out.println("Invalid input");
                //only works if b and c added is greater than a
            }
        }
        else{
            System.out.println("Invalid input");
            //only works if a and b added together is greater than c
        }
    }
}
