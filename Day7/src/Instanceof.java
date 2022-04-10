// 부모 클래스
class User {
    // 유저 클래스
}

// 자식 클래스
class Melon extends User {
    // 반하나 회원 클래스
}

public class Instanceof {
    public static void main(String[] args) {
        User user = new User();
        Melon melon = new Melon();
        User user_melon = new Melon();    // (O)
        // Banana banana_user = new User(); (X)

        System.out.println("user instanceof User : " + (user instanceof User));
        System.out.println("banana instanceof Banana : " + (melon instanceof Melon));
        System.out.println("user instanceof Banana : " + (user instanceof Melon));
        System.out.println("banana instanceof User : " + (melon instanceof User));
        System.out.println("user_banana instanceof User : " + (user_melon instanceof User));
        System.out.println("user_banana instanceof Banana : " + (user_melon instanceof Melon));

    }
}
