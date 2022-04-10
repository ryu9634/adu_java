import java.io.FileInputStream;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        String data="C:\\jys\\Java\\Day10\\data.txt";
        String data1;
        int kor, math, eng, tot;
        double avg;
        String name;

        try{
            Scanner sc=new Scanner(new FileInputStream(data));

            System.out.println("**********성적프로그램**********");
            while (sc.hasNextLine()){
                data1= sc.nextLine();
                String[] data2=data1.split(",");
                name=data2[0];
                kor=Integer.parseInt(data2[1]);
                math=Integer.parseInt(data2[2]);
                eng=Integer.parseInt(data2[3]);
                tot=kor+math+eng;
                avg=tot/3.0;

                System.out.println("이름 : " +name);
                System.out.println("국어점수 : " +kor);
                System.out.println("수학점수 : " +math);
                System.out.println("영어점수 : " +eng);
                System.out.println("총점 : "+ tot);
                System.out.println("평균점수 : "+avg);
                System.out.print("학점 : ");

                if (avg>=90){
                    System.out.println("A학점 입니다");
                    System.out.println();
                }else if (avg>=80){
                    System.out.println("B학점 입니다");
                    System.out.println();
                }else if (avg>=70){
                    System.out.println("C학점 입니다");
                    System.out.println();
                }else if (avg>=60){
                    System.out.println("D학점 입니다");
                    System.out.println();
                }else
                    System.out.println("F학점 입니다.");
                System.out.println();
            }


        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
