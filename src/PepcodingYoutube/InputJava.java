package PepcodingYoutube;

import java.util.Scanner;

public class InputJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); //for int input
//        for (int i = 0; i <=n ; i++) {
//            System.out.println(i);
//        }
//        String name  = sc.nextLine(); //for string input
//        System.out.println("Hello "+ name);

        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine()); //convert the string to int
        String name = scn.nextLine();
        System.out.println("Dear " + name + ". Here is counting");
        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }

    }
}
