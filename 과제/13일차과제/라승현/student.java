import java.util.Scanner;

public class student {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        stuDTO studto;
        stuDAO studao = new stuDAO();

        while (true){
            System.out.println("********** 메뉴 **********");
            System.out.println("원하시는 메뉴의 번호를 입력하세요");
            System.out.println("1. 학생 등록, 2. 학생 리스트, 3. 학생 수정, 4. 학생 삭제, 5. 프로그램 종료");
            int num = sc.nextInt();

            if(num == 5) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
            switch(num){
                case 1:
                    studao.insert();
                    break;
                case 2:
                    studao.list();
                    break;
                case 3:
                    studao.edit();
                    break;
                case 4:
                    studao.del();
                    break;
            }
        }
    }
}
