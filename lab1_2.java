import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("A day:");
        int day = sc.nextInt();

        System.out.print("A month:");
        int month = sc.nextInt();

        if (month==12 || month ==1 || month==2) {System.out.println ("Winter");}
        if (month==3 || month ==4 || month==5) {System.out.println ("Spring");}
        if (month==6 || month ==7 || month==8) {System.out.println ("Summer");}
        if (month==9|| month ==10 || month==11) {System.out.println ("Autumn");}

    }
    
}