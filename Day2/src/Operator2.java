/*
    성적 프로그램
    국어점수는 90점, 영어점수는 80점, 수학점수는 70점
    위 점수를 변수에 저장하고 총점과 평균을 구하는 프로그램을 작성

    결과)
    국어점수 : 90점
    영어점수 : 80점
    수학점수 : 70점
    총점 : 240점
    평균 : 80점
 */
public class Operator2 {
    public static void main(String[] args) {
        int kor = 90, eng = 80, math = 70;
        int tot = kor + eng + math;
        double avg = tot / 3.0;

        System.out.print("국어점수 : ");
        System.out.print(kor);
        System.out.print("점\n");

        System.out.print("영어점수 : ");
        System.out.print(eng);
        System.out.print("점\n");

        System.out.print("수학점수 : ");
        System.out.print(math);
        System.out.print("점\n");

        System.out.print("총점 : ");
        System.out.print(tot);
        System.out.print("점\n");

        System.out.print("평균 : ");
        System.out.print(avg);
        System.out.print("점\n");
    }
}
