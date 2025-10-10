import java.util.Scanner;

class divisor{
    int rec_gcd(int a, int b){
        if(a == 0){return b;}
        if(b == 0){return a;}
        if(a == b){return a;}
        else if(a > b){return rec_gcd(a-b, b);}
        else{return rec_gcd(a, b-a);}
    }
    int loop_gcd(int c, int d){
        if(c == 0){return d;}
        if(d == 0){return c;}
        while(c != d){
            if(c > d){
                c = c - d;
            }
            else {
                d = d - c;
            }
        }
        return c;
    }
}

public class Homework4 {
    public static void main(String[] args){
        divisor CallGcd = new divisor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 수를 입력하세요: ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        //재귀호출 방식
        int result_rec = CallGcd.rec_gcd(first, second);
        System.out.println("두 수의 최대공약수는 " + result_rec + "입니다");
        //반복문 방식
        int result_loop = CallGcd.loop_gcd(first, second);
        System.out.println("두 수의 최대공약수는 " + result_loop + "입니다");
    }
}
