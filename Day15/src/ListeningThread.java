import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ListeningThread extends Thread {

    Socket socket = null;

    public ListeningThread(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while(true){
                System.out.println(bufferedReader.readLine());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
