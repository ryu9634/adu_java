import java.io.FileInputStream;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        String file1= "data.txt";       //txt파일 가져오기

  try{              //예외처리
      System.out.println("**********결과갑**********");
      Scanner sc = new Scanner( new FileInputStream(file1));
      while (sc.hasNextLine()){ //줄의 여부 확인
          String str = sc.nextLine();     // 한 줄 읽어오기
          String[] student = str.split(",");
          System.out.println("이름 : " + student[0]);
          System.out.println("국어점수 : " + student[1]);
          System.out.println("영어점수 : " + student[2]);
          System.out.println("수학점수 : " + student[3]);
          int sum = Integer.parseInt(student[1]) +Integer.parseInt(student[2])+Integer.parseInt(student[3]);
          System.out.println("");
          System.out.println("총점 : "+sum);
          System.out.println("평균 : "+ sum/3);
          char grad;                    //학점
          switch ((sum/3)/10){
              case 9:
                  System.out.println("학점 : A 학점");
                  break;
              case 8:
                  System.out.println("학점 : B 학점");
                  break;
              case 7:
                  System.out.println("학점 : C 학점");
                  break;
              case 6 :
                  System.out.println("학점 : D 학점");
                  break;
              default:
          }
          System.out.println("===============");
      }
sc.close();             //문 닫아주기
  }catch (Exception e){         //케치문
      e.printStackTrace();
  }
    }
}