import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("x: ");
        int x = sc.nextInt();

        int n = -100;
        while (n < -15 || n > 15){
            System.out.print("n: ");
            n = sc.nextInt();
        }

        double result = x;
        for (int i = 1; i < Math.abs(n); i++) {result *= x;}
        if(n>0){System.out.println(result);} else {System.out.println((double) 1/result);}

    }

}