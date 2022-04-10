public class Word {
    private String english; // 영단어
    private String korean;  // 뜻
    private int level;      // 레벨
    private String wdate;   // 등록일자

    public Word(String english, String korean, int level, String wdate) {
        this.english = english;
        this.korean = korean;
        this.level = level;
        this.wdate = wdate;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getKorean() {
        return korean;
    }

    public void setKorean(String korean) {
        this.korean = korean;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWdate() {
        return wdate;
    }

    public void setWdate(String wdate) {
        this.wdate = wdate;
    }

    @Override
    public String toString() {
        // apple : 사과(레벨 1, 날짜 2021-11-17)
        return english + " : " + korean + "(레벨 " + level + ", 날짜 " + wdate + ")";
    }
}
