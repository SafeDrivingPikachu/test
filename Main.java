package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("==명언 앱==");

        int i = 1; //명언 번호

        while (true) {
            // 등록 또는 종료를 입력받기

            System.out.print("명령) ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (input.equals("등록")) {
                System.out.print("명언 : ");
                String insert = scanner.nextLine();

                System.out.print("작가 : ");
                String insert2 = scanner.nextLine();

                System.out.println(i + "번 명언이 등록되었습니다.");
                i++;

            } else if (input.equals("종료")){
                System.out.println("프로그램이 종료되었습니다.");
                break; //종료입력시 실행종료
            }
        }





    }
}