import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork_2 { //외부에서 데이터 값을 불러와 실행할수있게끔 프로그램 제작
    public static void main(String[] args) {

        String input = "E:\\Ryu\\Day10\\data.txt"; // 불러올 파일의 주소를 입력
        Scanner sc; // Scanner 클래스를 이용하기 위해 불러옴
        String info = ""; // 입력 받을 학생의 정보
        int i = 0; //배열방의 번호
        //String[] list = new String[10];// 배열의 크기를 10으로 설정
        ArrayList<String> list = new ArrayList<String>();
        try {
            sc = new Scanner(new FileInputStream(input)); //파일을 불러옴
            while (sc.hasNextLine()) {
                info = sc.nextLine();
                list.add(info);  //배열의 저장 시킴
                i++;  //크기증가 data.txt 줄이 4개라 4번돌고 탈출

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        String[] result = new String[4]; //이름과 점수를 담을 배열을 만듬 값이 4개 이므로 방의 크기는 4개로 설정

        for (i = 0; i < list.size(); i++) { //리스트의 길이만큼 반복문을 돌려줌
            String str = list.get(i);  //split 을 쓰기위해 [i] 번째 배열을 담아주고
            String[] split = str.split(","); //담긴 [i] 번배열을 다시 쪼개서 result[]에 나눠서 담아준다

            String name = split[0]; //나온 값을 바로 입력해주고
            String kor = split[1];
            String eng = split[2];
            String math = split[3];
            //그 전에 만들어둔 클래스 메소드를 불러와 실행시켜준다
            HomeWork_1 studentinfo = new HomeWork_1(name, kor, eng, math);
            System.out.println(studentinfo);

        }


    }
}
