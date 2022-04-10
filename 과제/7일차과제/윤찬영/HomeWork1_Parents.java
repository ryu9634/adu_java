public class HomeWork1_Parents {
    private String gameName;
    private int gameAge;

    public HomeWork1_Parents(){

    }

    public HomeWork1_Parents(String gameName, int gameAge) {
        this.gameName = gameName;
        this.gameAge = gameAge;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGameAge() {
        return gameAge;
    }

    public void setGameAge(int gameAge) {
        this.gameAge = gameAge;
    }

    public void powerOn(){
        System.out.println("게임을 실행이 완료되었습니다.");
    }

    public void powerOff(){
        System.out.println("게임이 종료되었습니다.");
    }

    @Override
    public String toString() {
        return "게임 개요{" +
                "gameName='" + gameName + '\'' +
                ", gameAge=" + gameAge +
                '}';
    }
}
