import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[영어 단어장]");
        System.out.println("print: 지금까지 등록한 영단어가 출력");
        System.out.println("find: 영어 단어를 검색할 수 있음");
        System.out.println("exit: 프로그램을 종료");

        String eng, kor, wdate;
        int lev;
        ArrayList<Word> list = new ArrayList();
        Word w;

        while(true){
            System.out.println("✔ 영어단어 또는 메뉴를 입력하세요");
            eng = sc.next();    // apple
            if(eng.equals("exit")) break;

            switch (eng){
                case "print":
                    for(int i=0; i<list.size(); i++){
                        System.out.println(list.get(i));
                        //System.out.println(list.get(i).getEnglish());
                    }
                    break;
                case "find":
                    System.out.println("* 찾는 단어를 입력하세요");
                    String find = sc.next();    // banana
                    boolean isFind = false;     // 단어를 찾았는지 여부
                    for(int i=0; i<list.size(); i++){
                        if(list.get(i).getEnglish().equals(find)){
                            System.out.println("단어를 찾았습니다! 😊😁");
                            System.out.println(list.get(i));
                            isFind = true;
                        }
                    }
                    if(!isFind) System.out.println("찾는 단어가 없습니다");
                    break;
                default:    // 단어장에 등록할 단어
                    System.out.println("* 뜻을 입력하세요 : ");
                    kor = sc.next();    // 사과
                    System.out.println("* 레벨을 입력하세요 : ");
                    lev = sc.nextInt(); // 1
                    System.out.println("* 날짜를 입력하세요 : ");
                    wdate = sc.next();  // 2021-11-17
                    w = new Word(eng, kor, lev, wdate);
                    list.add(w);
            }
        }
        System.out.println("프로그램을 종료합니다");
    }
}
