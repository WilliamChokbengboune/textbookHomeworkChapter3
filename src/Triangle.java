/**
 * Class: Triangle
 * Author:
 * Written:
 * Version: 1.0
 * Description: This program checks if any 2 added sides of a triangle are greater one size.
 * If the 2 sides are not greater than, it is not a triangle.
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter edge A: ");
        int a = in.nextInt();
        System.out.println("Enter edge B: ");
        int b = in.nextInt();
        System.out.println("Enter edge C: ");
        int c = in.nextInt();
        if (a + b > c){
            if (b + c > a){
                if (a + c > b){
                    System.out.println("valid");
                }
                else{
                    System.out.println("invalid");
                }
            }
            else{
                System.out.println("Invalid");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
