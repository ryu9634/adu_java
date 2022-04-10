import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        String stuData = "data.txt";
        Scanner sc;
        int kor, eng, math, tot, avg;

        try {
            FileInputStream fis = new FileInputStream(stuData);             // data.txt Open
            sc = new Scanner(fis);                                          // fis 객체 받아서 sc 저장
            System.out.println("성적 확인 프로그램");
            while (sc.hasNextLine()) {                                        // 내부에 줄이 있는지 체크
                String str = sc.nextLine();                                 // data.txt의 각 줄을 str에 리턴
                String[] list = str.split(",");                       // , 기준 split 진행 후 list의 각 배열에 입력

                kor = Integer.parseInt(list[1]);                             // String 타입 점수 integer 타입 형변환
                eng = Integer.parseInt(list[2]);
                math = Integer.parseInt(list[3]);
                tot = kor + eng + math;
                avg = tot / 3;

                System.out.println("이름 : " + list[0]);                     // 배열에 데이터가 정상적으로 입력됐는지 체크
                System.out.println("국어점수 : " + list[1]);                  // 배열에 데이터가 정상적으로 입력됐는지 체크
                System.out.println("영어점수 : " + list[2]);                  // 배열에 데이터가 정상적으로 입력됐는지 체크
                System.out.println("수학점수 : " + list[3]);                  // 배열에 데이터가 정상적으로 입력됐는지 체크
                System.out.println("합계 : " + tot);
                System.out.println("평균 : " + avg);
                if(avg >= 90){
                    System.out.println("학점 : A");
                }else if(avg >= 80 ){
                    System.out.println("학점 : B");
                }else if(avg >= 70){
                    System.out.println("학점 : C");
                }else if(avg >= 60){
                    System.out.println("학점 : D");
                }else
                    System.out.println("학점 : F");

                System.out.println("--------------------------");

                fis.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
