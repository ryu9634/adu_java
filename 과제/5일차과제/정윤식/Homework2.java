import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요");
        String str= sc.next();
        int[]num={2,3,4,5,6,7,8,9,2,3,4,5};
        int tot=0;
        int i=0;
        for (i=0; i<str.length()-1; i++) {
            String str2 = str.substring(i,i+1);
            int str3 = Integer.parseInt(str2);
            tot+= str3 * num[i];
        }
        int totfin=Integer.parseInt(str.substring(i,i+1));
        int result=(11-tot%11)%10;
        if(totfin==result)
            System.out.println("🎉🎉🎉올바른 주민등록번호 입니다🎉🎉🎉");
        else
            System.out.println("???다시 입력해보세요!!!????");
        }

    }

