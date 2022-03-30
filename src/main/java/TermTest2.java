import java.util.Scanner;

public class TermTest2 {
    public static void main(String[] args) {
        //Q2. 내가 입력한 숫자가 3의 배수인지? 5배수인지?

        Scanner s = new Scanner(System.in);

        int a;

        System.out.printf("숫자를 입력하세요 : ");
        a = s.nextInt();

        if ( a % 3 == 0) {
            System.out.printf("3의 배수입니다.");
        }
        if (( a % 3 == 0) && ( a % 5 == 0)){
            System.out.printf("3과 5의 배수 둘다 만족합니다.");
        }
        if ( a % 5 == 0){
            System.out.printf("5의 배수입니다.");
        }
    }
}
