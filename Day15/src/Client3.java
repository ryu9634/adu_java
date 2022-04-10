import java.io.IOException;
import java.net.Socket;

public class Client3 {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("127.0.0.1", 9999);
            System.out.println("서버 접속 성공 !");

            // 서버 -> 클라이언트로 (데이터를 전송받는 쓰레드)
            ListeningThread listeningThread = new ListeningThread(socket);
            // 클라이언트 -> 서버 (데이터를 전달하는 쓰레드)
            WritingThread writingThread = new WritingThread(socket);

            listeningThread.start();
            writingThread.start();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
