import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WritingThread extends Thread{
    Socket socket = null;
    Scanner scanner = new Scanner(System.in);

    public WritingThread(Socket socket){
        this.socket = socket;
    }

    public void run(){
        try {
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            while(true){
                printWriter.println(scanner.nextLine());
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
