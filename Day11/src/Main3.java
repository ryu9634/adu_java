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

        System.out.println("ππ μμ΄ λ¨μ΄μ₯ ππ");
        System.out.println("print : μ§κΈκΉμ§ λ±λ‘ν μμ΄λ¨μ΄κ° μΆλ ₯λ©λλ€");
        System.out.println("find : μμ΄λ¨μ΄λ₯Ό κ²μν  μ μμ΅λλ€");
        System.out.println("save : νμΌμ μ μ₯ν©λλ€");
        System.out.println("exit : νλ‘κ·Έλ¨μ μ’λ£ν©λλ€");

        while(true){
            System.out.println("* μμ΄λ¨μ΄ λλ λ©λ΄λ₯Ό μλ ₯νμΈμ");
            eng = sc.next();
            if(eng.equals("exit")) break;

            switch (eng){
                case "print":
                    wordController.list();
                    break;
                case "find":
                    if(!wordController.find()){
                        System.out.println("μ°Ύλ λ¨μ΄κ° μμ΅λλ€");
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
