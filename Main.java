package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> quotes = new ArrayList<>(); // 명언 저장 리스트
        List<String> authors = new ArrayList<>(); // 작가 저장 리스트
        System.out.println("==명언 앱==");

        int i = 1; //명언 번호
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 등록 또는 종료 또는 목록을 입력받기

            System.out.print("명령) ");

            String input = scanner.nextLine();

            if (input.equals("등록")) {
                System.out.print("명언 : ");
                String insert = scanner.nextLine();
                quotes.add(insert);

                System.out.print("작가 : ");
                String insert2 = scanner.nextLine();
                authors.add(insert2);

                System.out.println(i + "번 명언이 등록되었습니다.");
                i++;

            } else if (input.equals("종료")) {
                System.out.println("프로그램이 종료되었습니다.");
                break; //종료입력시 실행종료
            } else if (input.equals("목록")) {
                //저장된 정보 출력
                for (int j = quotes.size() - 1; j >= 0 ; j--) {
                    System.out.println((j + 1) + " / " + authors.get(j) + " / " + quotes.get(j));
                }
            } else {
                System.out.println("잘못된 명령어입니다."); // 잘못된 명령어
            }


        }
    }
}