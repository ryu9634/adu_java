import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("학생들을 몇명이나 등록 할까요");
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        System.out.println(student+"명을 입력하셨습니다");

        HomeWork2[] arry = new HomeWork2[student];

        for (int i = 0; i < arry.length; i++) {




        arry[i]= new HomeWork2();
        System.out.println("번호를 입력해 주세요");
        arry[i].setNum(sc.nextInt());
        System.out.println("이름을 입력해 주세요");
        arry[i].setName(sc.next());
        System.out.println("국어점수를 입력해 주세요");
        arry[i].setKor(sc.nextInt());
        System.out.println("수학점수를 입력해 주세요");
        arry[i].setMath(sc.nextInt());
        System.out.println("영어점수를 입력해 주세요");
        arry[i].setEng(sc.nextInt());

//        arry[i].setTot();
        System.out.print("번호"+arry[i].getNum());
        System.out.println("이름" +arry[i].getName());
            System.out.println("  점수  ");
        System.out.print(" "+arry[i].getKor()+"점");
        System.out.print(" "+arry[i].getMath()+"점");
        System.out.print(" "+arry[i].getEng()+"점");
        System.out.println(" "+arry[i].getTot()+"점");
        System.out.println(" "+arry[i].getAvg()+"점");

//        System.out.println();
    }}}


