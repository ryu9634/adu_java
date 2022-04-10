public class HomeWork1_Child extends HomeWork1_Parents{                        // 상속
    private String gameMusic;

    public HomeWork1_Child(String gameName, int gameAge, String gameMusic) {   // 생성자
        super(gameName, gameAge);                                              // super
        this.gameMusic = gameMusic;                                            // this
    }

    public String getGameMusic() {
        return gameMusic;
    }

    public void setGameMusic(String gameMusic) {
        this.gameMusic = gameMusic;
    }

    public void powerOn(){                                                      // 오버라이딩
        System.out.println("게임을 실행이 완료되었습니다.");
        System.out.println("안녕하세요! " + getGameName() + "에 오신것을 환영합니다.");
    }

    public void security(String id, int pW){                                    // 오버로딩
        System.out.println("아이디 생성 완료");

    }
    public void security(int pW){                                                // 오버로딩
        System.out.println("비밀번호 확인");

    }


    @Override                                                                    // 오버라이딩
    public String toString() {
        return super.toString() + "{" +
                "gameMusic='" + gameMusic + '\'' +
                '}';
    }
}
