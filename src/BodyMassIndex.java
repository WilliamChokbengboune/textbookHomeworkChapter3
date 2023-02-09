/**
 * Class: BodyMassIndex
 * Author: William Chokbengboune
 * Written: 2/9/2023
 * Version: 1.0
 * Description: This program takes converts the weight in pounds to kilograms.
 * Once converted, divide the weight by height
 */

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight: ");//weight is in pounds
        double weight = input.nextDouble();
        System.out.println("Enter your height: ");//height is in inches
        double height = input.nextDouble();
        double convertedWeight = weight * 0.4536;//converted weight is in kg
        double convertedHeight = height * 0.0254;//converted height is in meters
        double bodyMassIndex = convertedWeight / Math.pow(convertedHeight,2);
        System.out.printf("Your BMI is %.2f", bodyMassIndex);

    }
}
