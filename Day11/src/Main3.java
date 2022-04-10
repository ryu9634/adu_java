import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Word w;
        WordController wordController = new WordController();
        wordController.setList(new ArrayList<Word>());

        String eng;

        String file = "wordbook.txt";
        wordController.read(file);

        System.out.println("😎😎 영어 단어장 😎😎");
        System.out.println("print : 지금까지 등록한 영어단어가 출력됩니다");
        System.out.println("find : 영어단어를 검색할 수 있습니다");
        System.out.println("save : 파일에 저장합니다");
        System.out.println("exit : 프로그램을 종료합니다");

        while(true){
            System.out.println("* 영어단어 또는 메뉴를 입력하세요");
            eng = sc.next();
            if(eng.equals("exit")) break;

            switch (eng){
                case "print":
                    wordController.list();
                    break;
                case "find":
                    if(!wordController.find()){
                        System.out.println("찾는 단어가 없습니다");
                    }
                    break;
                case "save":
                    wordController.save(file);
                    break;
                default:
                    wordController.insert(eng);
            }
        }

    }
}
