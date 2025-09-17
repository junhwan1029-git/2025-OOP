import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.print("첫번째 정수: ");
        int a = sc.nextInt();
        total = total + a;
        System.out.printf("지금까지의 합: %d\n", total);

        System.out.print("두 번째 정수: ");
        int b = sc.nextInt();
        total = total + b;
        System.out.printf("지금까지의 합: %d\n", total);

        System.out.print("세 번째 정수: ");
        int c = sc.nextInt();
        total = total + c;
        System.out.printf("지금까지의 합: %d\n", total);

        System.out.print("네 번째 정수: ");
        int d = sc.nextInt();
        total = total + d;
        System.out.printf("지금까지의 합: %d\n", total);

        System.out.print("다섯 번째 정수: ");
        int e = sc.nextInt();
        total = total + e;
        System.out.printf("지금까지의 합: %d\n", total);
    }
}
