/*
    성적 프로그램
    국어점수는 90점, 영어점수는 80점, 수학점수는 70점
    위 점수를 변수에 저장하고 총점과 평균, 합격여부(삼항연산자를 활용)를 구하는 프로그램을 작성
    (단, 합격여부는 평균점수로 하며 60점이상은 합격, 60점 미만은 불합격)
    결과)
    국어점수 : 90점
    영어점수 : 80점
    수학점수 : 70점
    총점 : 240점
    평균 : 80점
    합격여부 : 합격
 */
public class Operator9 {
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

        System.out.print("합격여부 : ");
        System.out.print(avg >= 60 ? "합격" : "불합격");
    }
}
