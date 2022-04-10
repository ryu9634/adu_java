/*
과제.
아래 data.txt를 읽어 다음과 같이 출력하는 프로그램을 작성해보자. ( split 잘 할 것)
(학점은 평균기준이며 90점이상은 A, 80점이상은 B, 70점이상은 C, 60점 이상은 D, 나머지는 F)
data.txt
김사과,90,80,100
오렌지,100,90,70
반하나,60,80,90
이메론,70,80,85

결과
********** 성적 프로그램 **********
이름 : 김사과
국어점수 : 90
영어점수 : 80
수학점수 : 100
총점 : XXX
평균 : XXX
학점 : XXX

.....
.....
.....
 */
import java.io.BufferedReader;
import java.io.FileReader;

public class Homework1 {
    public static void main(String[] args) {
        String str = "data.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(str));
            String[][] data = new String[4][4];
            //데이터를 [4][4] 배열에 스플릿해서 넣기
            for (int i = 0; i < data.length; i++) {
                data[i] = br.readLine().split(",");
            }
            //데이터 잘 들어갔나 출력해보기
//            for (int i = 0; i < data.length; i++) {
//                for (int j = 0; j < data[i].length; j++) {
//                    System.out.print(data[i][j] + " ");
//                }
//                System.out.println(" ");
//            }
            System.out.println("********** 성적 프로그램 **********");
            for (int i = 0; i < data.length; i++) {
                int j = 0;
                    System.out.println("이름 : " + data[i][j]);
                    j++;
                    System.out.println("국어점수 : " + data[i][j]);
                    j++;
                    System.out.println("영어점수 : " + data[i][j]);
                    j++;
                    System.out.println("수학점수 : " + data[i][j]);
                    j++;
                int sum = Integer.parseInt(data[i][1]) + Integer.parseInt(data[i][2]) + Integer.parseInt(data[i][3]);
                int avg = sum / 3 ;
                System.out.println("총점 : " + sum);
                System.out.println("평균 : " + avg);
                if(avg >= 90) {
                    System.out.println("학점 : A ");
                }else if(avg >=80 && avg < 90){
                    System.out.println("학점 : B ");
                }else if(avg >=70 && avg < 80){
                    System.out.println("학점 : C ");
                }else if(avg >=60 && avg < 70){
                    System.out.println("학점 : D ");
                } else if(avg >=0 && avg < 60){
                    System.out.println("학점 : F ");
                }
                System.out.println(" ");
            }
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
