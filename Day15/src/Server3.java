import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server3 extends Thread {

    static ArrayList<Socket> list = new ArrayList<>();  // 사용자
    static Socket socket;

    public Server3(Socket socket){
        this.socket = socket;   // 사용자 소켓 저장
        list.add(socket);       // list에 사용자를 추가
    }

    public void run(){
        try{
            System.out.println("서버 메세지 : " + socket.getInetAddress() + " ip의 클라이언트가 연결되었습니다");
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream out = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(out, true);
            printWriter.println("서버에 연결되었습니다 ID를 입력하세요");

            String readLine;
            String userid = null;
            boolean isNotify = false;

            while((readLine = br.readLine()) != null){
                if(!isNotify){
                    userid = readLine;
                    isNotify = true;
                    printWriter.println(userid + "님이 접속하였습니다");
                    continue;
                }
                for(int i=0; i<list.size(); i++){
                    out = list.get(i).getOutputStream();
                    printWriter = new PrintWriter(out, true);
                    printWriter.println(userid + " : " + readLine);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            int port = 9999;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("서버 메세지 : " + port + "포트로 서버가 시작되었습니다");
            while(true){
                Socket socket = serverSocket.accept();
                Thread thread = new Server3(socket);
                thread.start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
