/*
π κ³Όμ  : νμ κ΄λ¦¬ νλ‘κ·Έλ¨ λ§λ€κΈ°

            λ©λ΄λ₯Ό μ ννμΈμ
            1. μλ ₯ 2. μΆλ ₯ 3. κ²μ 4. μ­μ  5. μμ  6. μ’λ£
            μλ ₯ μ νμ νλ², λ°, μ΄λ¦, λμ΄, μ°λ½μ² μ μ₯
            μΆλ ₯ μ νμ μλ ₯λ λ°μ΄ν° μΆλ ₯
            κ²μ μ νμ κ²μν  νμμ νλ² μλ ₯νμ¬ toString μΆλ ₯
            γ- falseμ κ²½μ° " μ°Ύλ νμμ μ λ³΄κ° μμ΅λλ€. "
            μ­μ  μ νμ μ­μ ν  νμ νλ² μλ ₯μ μ­μ  ν "μ­μ λμμ΅λλ€ !"
            μμ  μ νμ μμ ν  νμ νλ² μ ννλ©΄ 1λ²μΌλ‘ λμκ°
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAdmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[νμ κ΄λ¦¬ νλ‘κ·Έλ¨]");
        System.out.println("μλμ λ©λ΄λ₯Ό μ ννμΈμ.");

        String name;
        int stuNum, claNum, age, phoneNum;
        AdminOrd ord;
        AdminOrd refresh;

        ArrayList<AdminOrd> arrList = new ArrayList<>();

        while (true) {
            System.out.println("1. μλ ₯ 2. μΆλ ₯ 3. κ²μ 4. μ­μ  5. μμ  6. μ’λ£");
            int num = sc.nextInt();

            if (num == 6) {
                System.out.println("νλ‘κ·Έλ¨μ μ’λ£ν©λλ€.");
                break;
            }
            switch (num) {
                case 1:                                     // μλ ₯
                    System.out.println("νμμ μ λ³΄λ₯Ό μμλλ‘ μλ ₯ν΄μ£ΌμΈμ.");
                    System.out.print("νλ² : ");
                    stuNum = sc.nextInt();
                    System.out.print("λ° : ");
                    claNum = sc.nextInt();
                    System.out.print("μ΄λ¦ : ");
                    name = sc.next();
                    System.out.print("λμ΄ : ");
                    age = sc.nextInt();
                    System.out.print("μ°λ½μ² : ");
                    phoneNum = sc.nextInt();
                    System.out.println(name + " νμμ μ λ³΄λ₯Ό μ μ₯νμ΅λλ€.");

                    ord = new AdminOrd(stuNum, claNum, name, age, phoneNum);
                    arrList.add(ord);
                    break;
                case 2:                                     // μΆλ ₯
                    if(arrList.size() == 0){
                        System.out.println("μλ ₯λ μ λ³΄κ° μμ΅λλ€.");
                        break;
                    }
                    System.out.println("μλ ₯νμ  νμ μ λ³΄ μλλ€.");
                    for (int i = 0; i < arrList.size(); i++) {
                        System.out.println(arrList.get(i));
                    }
                    break;
                case 3:                                     // κ²μ
                    if(arrList.size() == 0){
                        System.out.println("μλ ₯λ μ λ³΄κ° μμ΅λλ€.");
                        break;
                    }
                    System.out.println("κ²μν  νμμ νλ²μ μλ ₯νμΈμ.");
                    System.out.print("νλ² : ");
                    num = sc.nextInt();
                    boolean isFind = false;
                    for (int i = 0; i < arrList.size(); i++) {
                        if (num == arrList.get(i).getStunum()) {
                            System.out.println("μλ ₯νμ  νλ² " + arrList.get(i).getStunum() + "μ μ λ³΄λ₯Ό μ°Ύμμ΅λλ€.");
                            System.out.println(arrList.get(i));
                            isFind = true;
                        }
                    }
                    if (!isFind) System.out.println("κ²μνμ  νμμ μ λ³΄κ° μμ΅λλ€.");
                    break;
                case 4:                                     // μ­μ 
                    if(arrList.size() == 0){
                        System.out.println("μλ ₯λ μ λ³΄κ° μμ΅λλ€.");
                        break;
                    }
                    System.out.println("μ­μ ν  νμμ νλ²μ μλ ₯νμΈμ.");
                    System.out.print("νλ² : ");
                    num = sc.nextInt();
                    isFind = false;
                    for (int i = 0; i < arrList.size(); i++) {
                        if (num == arrList.get(i).getStunum()) {
                            System.out.println("μλ ₯νμ  νλ² " + arrList.get(i).getStunum() + "μ μ λ³΄λ₯Ό μ­μ νμ΅λλ€.");
                            arrList.remove(i);
                            isFind = true;
                        }
                    }
                    if (!isFind) System.out.println("μμ²­νμ  νμμ μ λ³΄κ° μμ΅λλ€.");
                    break;
                case 5:                                     // μμ 
                    if(arrList.size() == 0){
                        System.out.println("μλ ₯λ μ λ³΄κ° μμ΅λλ€.");
                        break;
                    }
                    System.out.println("μμ ν  νμμ νλ²μ μλ ₯νμΈμ.");
                    System.out.print("νλ² : ");
                    num = sc.nextInt();
                    isFind = false;
                    for (int i = 0; i < arrList.size(); i++) {
                        if (num == arrList.get(i).getStunum()) {
                            System.out.println("μμ νμ€ νλ² " + arrList.get(i).getStunum() + "μ μ λ³΄λ₯Ό μλ ₯νμΈμ.");
                            System.out.print("νλ² : ");
                            stuNum = sc.nextInt();
                            System.out.print("λ° : ");
                            claNum = sc.nextInt();
                            System.out.print("μ΄λ¦ : ");
                            name = sc.next();
                            System.out.print("λμ΄ : ");
                            age = sc.nextInt();
                            System.out.print("μ°λ½μ² : ");
                            phoneNum = sc.nextInt();
                            System.out.println(name + " νμμ μ λ³΄λ₯Ό μμ νμ΅λλ€.");

                            ord = new AdminOrd(stuNum, claNum, name, age, phoneNum);
                            arrList.set(i, ord);
                            isFind = true;
                        }
                    }
                    if (!isFind) System.out.println("μμ ν  νμμ μ λ³΄κ° μμ΅λλ€.");
                    break;
            }
        }
    }
}