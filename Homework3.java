import java.util.Scanner;

public class Homework3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 개의 수를 입력할 예정이신가요?: ");
        int nnumber = scanner.nextInt(); //nnumber: 정수의 개수
        int[] arr_number = new int[nnumber];//nnumber크기의 배열 생성

        System.out.println("수를 입력하세요: ");
        for(int i = 0; i < nnumber ; i++){
            arr_number[i] = scanner.nextInt();
        }
        int max_number = arr_number[0], min_number = arr_number[0];
        for(int i = 0; i < nnumber ; i++){
            if (max_number < arr_number[i]){
                max_number = arr_number[i];
            }
            if (min_number > arr_number[i]) {
                min_number = arr_number[i];
            }

        }
        System.out.println("최댓값: " + max_number);
        System.out.println("최솟값: " + min_number);


    }
}