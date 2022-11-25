import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Введите кол-во точек: ");
        int dots = sc.nextInt();

        System.out.print("Введите радиус окружности: ");
        int r = sc.nextInt();

        int dotsInCircle = 0;
        for (int i = 1; i <= dots; i++) {
            System.out.print("Введите координату X" + i);
            double x = sc.nextDouble();

            System.out.print("Введите координату Y" + i);
            double y = sc.nextDouble();

            if (x * x + y * y <= r * r) {
                dotsInCircle++;
            }
        }
        System.out.println(dotsInCircle + " точек попали в окружность");

    }
    
}