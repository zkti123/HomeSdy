package com.green.javaHome.sty.study_one.collections_framework;

import java.util.*;

public class Ex11_Stack_QueueEx2 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;
    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.println(">>");
            try {
                //화면으로 부터 라인단위로 입력받는다
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if ("".equals(input)) {
                    continue;
                }
                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);

                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 보여줍니다");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("history - 최근에 입력한 명령어를" + MAX_SIZE + "개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {//equalsIgnoreCase는 문자열을 비교할 때 대소문자를 무시하고 비교
                    int i = 0;
                    //입력받은 명령어 저장하고,
                    save(input);
                    //LinkdList 의 내용을 보여준다
                    LinkedList tmp = (LinkedList) q;

                    //Java의 리스트(List)를 반복(iterate)할 때 사용되는 인터페이스
                    // 리스트 내의 요소들을 앞뒤로 이동하면서 접근하고 수정할 수 있는 기능을 제공
                    //final int SIZE = list.size();
                    //for (int i = 0; i <SIZE ; i++) {
//                    System.out.println((i+1) + "." + list.get(i));
                    //}
                    ListIterator it = tmp.listIterator();

                    //hasNext()는 Java에서 Iterator와 ListIterator와 같은 반복자(Iterator)를 사용할 때 주로 쓰이는 메서드 중 하나
                    // 이 메서드는 반복자가 다음 요소가 있는지 여부를 확인하는 역할
                    while (it.hasNext()) {
                        System.out.println(++i + "." + it.next());
                    }

                } else {

                    save(input);
                    System.out.println(input);
                } //if (input.equalsIgnoreCase("q")

            } catch (Exception e) {
                System.out.println("입력 오류입니다.");
            }
        }

    }

    public static void save(String input) {
        //queue 에 저장한다
        if (!"".equals(input)) {
            q.offer(input);
            if (q.size() > MAX_SIZE) {
                q.remove();
            }
        }
    }
}
