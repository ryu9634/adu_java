import java.io.*;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("127.0.0.1", 9999);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));

            BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
            while(true){
                System.out.print("메세지 입력 : ");
                String data = key.readLine();
                if(data.equals("Q") || data.equals("q")){
                    System.out.println("채팅 종료");
                    break;
                }
                pw.println(data);
                pw.flush();
            }
            br.close();
            pw.close();
            socket.close();
            key.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
