/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
public class App {
    Scanner inp = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        double r = myApp.readR();
        int a = myApp.readA();
        int w = myApp.readW();
        int h = myApp.readH();


        System.out.println("\n" + myApp.legal(a, w, r, h));
    }

    private double readR(){
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        int gender = inp.nextInt();
        if(gender == 1)
            return .73;
        else
            return 0.66;
    }
    private int readH(){
        System.out.print("How many hours has it been since your last drink? ");
        return inp.nextInt();
    }
    private int readW(){
        System.out.print("What is your weight, in pounds? ");
        return inp.nextInt();
    }
    private int readA(){
        System.out.print("How many ounces of alcohol did you have? ");
        return inp.nextInt();
    }
    private String legal(int a, int w, double r, int h){
        double bac = (a * 5.14 / w * r) - (0.015 * h);
        return ((bac > 0.08) ? "Your BAC is " + bac + "\nIt is not legal for you to drive.\n" : "Your BAC is " + bac + "\nIt is legal for you to drive.\n");
    }
}
