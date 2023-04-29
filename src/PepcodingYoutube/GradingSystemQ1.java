package PepcodingYoutube;

import java.util.Scanner;

public class GradingSystemQ1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int marksStudent = sc.nextInt();
        if(marksStudent>90)
        {
            System.out.println("excellent");
        }else if(marksStudent>80 && marksStudent<=90)
        {
            System.out.println("good");
        }else if(marksStudent>70 && marksStudent<=80)
        {
            System.out.println("fair");
        }else if(marksStudent>60 && marksStudent<=70)
        {
            System.out.println("Meet expectations");
        }else
        {
            System.out.println("below par");
        }
    }
}
