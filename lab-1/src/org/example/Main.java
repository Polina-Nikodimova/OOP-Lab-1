package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double x = input.nextDouble();

        double y = Math.pow((a/(b*Math.pow(x,2) + c))+(b*Math.pow(Math.sin(x),2)),2);
        System.out.println(Math.round(y * 100.0) / 100.0);
    }
}
