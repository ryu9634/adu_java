import java.io.File;
import java.io.FileReader;

public class HomeWork1_FileReader {
    public static void main(String[] args) {
        String data = "data.txt";
        String name;
        int langScore, engScore, mathScore, totalScore;
        double avgScore;

        try {
            File file = new File(data);
            FileReader fr = new FileReader(file);

            char[] studentData = new char[(int) file.length()];
            // 문자 단위의 입력을 받기위해 char 배열 생성

            fr.read(studentData);
            // OS가 가지고 있는 필드값 문자 단위로 배열에 저장

            String answer = new String(studentData);
            // char 배열을 String 생성자를 사용하여 변환

            String[] outData = answer.trim().replace(System.lineSeparator(), ",").split(",");
            //null과 공백값 제거후 스플릿 ( 배열의 길이가 실제 표현하려는 char의 길이보다 김 )
            // 윈도우에서 enter(개행)의 char적인 표현은 자바에서 \r\n 이고 리눅스에서는 \n이기 때문에
            // lineSeparator()를 사용하지 않으려면 윈도우에서는 "\r\n"입력 , 리눅스에서는 "\n"입력
            // lineSeparator() : OS에 맞는 개행문자를 호출
            // 그후 split

            System.out.println("********** 성적 프로그램 **********");
            for (int i = 0; i < outData.length; i += 4) {
                name = outData[i];
                langScore = Integer.parseInt(outData[i + 1]);
                engScore = Integer.parseInt(outData[i + 2]);
                mathScore = Integer.parseInt(outData[i + 3]);
                totalScore = langScore + engScore + mathScore;
                avgScore = totalScore / (double) 3;

                System.out.println("이름 : " + name);
                System.out.println("국어점수 : " + langScore);
                System.out.println("영어점수 : " + engScore);
                System.out.println("수학점수 : " + mathScore);
                System.out.println("총점 : " + totalScore);
                System.out.println("평균 : " + (int) avgScore);
                System.out.print("학점 : ");
                System.out.println
                        (avgScore >= 90 ? "A" :
                                avgScore >= 80 ? "B" :
                                        avgScore >= 70 ? "C" :
                                                avgScore >= 60 ? "D" : "F");
                System.out.println();
            }
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
