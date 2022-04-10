import java.io.FileInputStream;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc;
        String data = "data.txt";
        try{
            sc = new Scanner(new FileInputStream(data));    // data.txt 파일을 FileInputStream 으로 열어서
                                                            // Scanner 로 데이터를 sc에 저장
            System.out.println("********** 성적 프로그램 **********");
            while(sc.hasNextLine()){                      // hasNextLine() 메소드는 enter 치기 전까지 쓴 문자열이 있나 확인
                                                          // return 값은 boolean

                String line = sc.nextLine();              // nextLine() 메소드는 enter 를 치기 전까지 쓴 문자열을 모두 리턴

                String[] arr = line.split(",");     // 리턴받은 문자열을 ","기준으로 split 후 arr 배열에 순차적으로 대입
                System.out.println("이름 : " + arr[0]);
                System.out.println("국어점수 : " + arr[1]);
                System.out.println("영어점수 : " + arr[2]);
                System.out.println("수학점수 : " + arr[3]);
                Integer kor = Integer.parseInt(arr[1]);     // 계산을 위해 String -> Integer 로 변환
                Integer eng = Integer.parseInt(arr[2]);
                Integer math = Integer.parseInt(arr[3]);
                System.out.println("총점 : " + (kor + eng + math));   // 점수의 합
                int avg = (kor+eng+math) / (arr.length-1);           // 점수들의 평균
                System.out.println("평균 : " + avg);
                if(avg >= 90){                                      // 학점 계산기
                    System.out.println("학점 : A");
                }else if(avg >= 80 ){
                    System.out.println("학점 : B");
                }else if(avg >= 70){
                    System.out.println("학점 : C");
                }else if(avg >= 60){
                    System.out.println("학점 : D");
                }else
                    System.out.println("학점 : F");

                System.out.println("--------------------------");   // 각 학생들의 구분자
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
