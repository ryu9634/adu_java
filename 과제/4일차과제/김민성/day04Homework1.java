import java.util.Scanner;

public class day04Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("가위,바위,보 중 하나를 선택해주세요");
            String choice = sc.next();

            double rd = Math.random();
            int com = (int) (rd * 3) + 1;
            // 1.보 2.바위 3.가위
            if (choice.equals("보")) {
                if (com == 1) {
                    System.out.println("com 가위");
                    System.out.println("유저 보");
                    System.out.println("lose");

                } else if (com == 2) {
                    System.out.println("com 바위");
                    System.out.println("유저 보");
                    System.out.println("win");
                    break;
                } else if (com == 3) {
                    System.out.println("com 가위");
                    System.out.println("유저 보");
                    System.out.println("lose");

                    if (choice.equals("바위")) {
                        if (com == 1) {
                            System.out.println("com 보");
                            System.out.println("유저 보");
                            System.out.println("draw");
                        } else if (com == 2) {
                            System.out.println("com 바위");
                            System.out.println("유저 바위");
                            System.out.println("draw");
                            break;
                        } else if (com == 3) {
                            System.out.println("com 가위");
                            System.out.println("유저 바위");
                            System.out.println("win");
                            break;

                        } if (choice.equals("가위")) {
                                if (com == 1) {
                                    System.out.println("com 보");
                                    System.out.println("유저 가위");
                                    System.out.println("win");
                                    break;
                                } else if (com == 2) {
                                    System.out.println("com 바위");
                                    System.out.println("유저 가위");
                                    System.out.println("lose");
                                    break;
                                } else if (com == 3) {
                                    System.out.println("com 가위");
                                    System.out.println("유저 가위");
                                    System.out.println("draw");

                                } else {
                                    System.out.println("가위바위보 종료");

                                }

                            }

                        }

                    }
                }
            }
        }

    }
