import java.util.Scanner;

public class calculation {
    public static void main(String[] args){
        int a, b; //입력받을 변수
        int result; //계산 결과물
        char how; //연산자

        Scanner s = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력: ");
        a = s.nextInt();
        System.out.print("두 번째 숫자 입력: ");
        b = s.nextInt();
        System.out.print("연산자 입력하세요!: ");
        how = s.next().charAt(0); //연산자 입력

        switch(how){
            case '+':
                result = a + b;
                System.out.println("정답은 " + result + "입니다.");
                break;
            case '-':
                result = a - b;
                System.out.println("정답은 " + result + "입니다.");
                break;
            case '*':
                result = a * b;
                System.out.println("정답은 " + result + "입니다.");
                break;
            case '/':
                result = a / b;
                System.out.println("정답은 " + result + "입니다.");
                break;
            case '%':
                result = a % b;
                System.out.println("정답은 " + result + "입니다.");
                break;
        }
    }
}