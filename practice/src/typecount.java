import java.util.Scanner;

public class typecount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        char ch;
        int upper_cnt = 0, lower_cnt = 0, digit_cnt = 0; //대문자, 소문자, 숫자
        int i;

        System.out.printf("문자를 입력하세요!: ");
        str = s.nextLine(); //문자열을 입력받는다.

        //1. for문 이용
        for (i = 0; i<str.length(); i++){
            ch = str.charAt(i); //문자열에서 한 글자를 추출
            if (ch >= 'A' && ch <= 'Z') //ch가 대문자면
                upper_cnt++; //대문자 개수 올리기
            if (ch >= 'a' && ch <= 'z') //ch가 소문자면
                lower_cnt++; //소문자 개수 올리기
            if (ch >= '0' && ch <= '9') //ch가 0~9 사이의 숫자라면
                digit_cnt++; //숫자 개수 올리기

        }

        /* 2. do-while문 이용
        i = 0;
        do {
            ch = str.charAt(i); //문자열에서 한 글자를 추출
            if (ch >= 'A' && ch <= 'Z') //ch가 대문자면
                upper_cnt++; //대문자 개수 올리기
            if (ch >= 'a' && ch <= 'z') //ch가 소문자면
                lower_cnt++; //소문자 개수 올리기
            if (ch >= '0' && ch <= '9') //ch가 0~9 사이의 숫자라면
                digit_cnt++; //숫자 개수 올리기

            i++;
        }while (i < str.length()); //i가 사용자가 입력한 문자열 길이보다 작을 동안 반복 */

        System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개\n", upper_cnt, lower_cnt, digit_cnt);
    }
}