import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        String file = "data.txt";
        String fos = "data1.txt";
        Scanner sc;

        String temp;
        String[] stuData;
        stuData = new String[4];

        try{

            sc = new Scanner(new FileInputStream((file)));

            while(sc.hasNextLine()){
                String num = sc.nextLine();
                stuData = num.split(",");
/*
                for (String d : stuData){                           // split 정상 처리 확인
                    System.out.println(d);
                }
*/
                int kor = Integer.parseInt(stuData[1]);             // 과목별 점수 입력
                int eng = Integer.parseInt(stuData[2]);
                int math = Integer.parseInt(stuData[3]);
                int tot = kor + eng + math;
                int avg = tot / 3;

                System.out.println("이름 : " + stuData[0]);
                System.out.println("국어 점수 : " + stuData[1]);
                System.out.println("영어 점수 : " + stuData[2]);
                System.out.println("수학 점수 : " + stuData[3]);
                System.out.println("총점 : " + tot);
                System.out.println("평균 : " + avg);

                if(avg >= 90){
                    System.out.println("학점 : A");
                    temp = "학점 : A";
                }else if(avg >= 80 ){
                    System.out.println("학점 : B");
                    temp = "학점 : B";
                }else if(avg >= 70){
                    System.out.println("학점 : C");
                    temp = "학점 : C";
                }else if(avg >= 60){
                    System.out.println("학점 : D");
                    temp = "학점 : D";
                }else{
                    System.out.println("학점 : F");
                    temp = "학점 : F";
                    }

                System.out.println("--------------------------");

                PrintWriter print = new PrintWriter(fos);
                for (int i = 0; i < stuData.length; i++) {
                    print.write("이름 : " + stuData[0] + "\n");
                    print.write("국어 점수 : " + stuData[1] + "\n");
                    print.write("영어 점수 : " + stuData[2] + "\n");
                    print.write("수학 점수 : " + stuData[3] + "\n");
                    print.write("총점 : " + tot + "\n");
                    print.write("평균 : " + avg + "\n");
                    print.write(temp + "\n");
                }
                print.close();
            }

            sc.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
