package academy.learnprogramming;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketController{
    private Socket socket;
    public SocketController(){}
    public <T> SocketController( T hostip) throws IOException{
        this.socket = new Socket((String) hostip,8081);
    }
    public void setSocketConnection(String hostip,int port) throws IOException {
        this.socket = new Socket(hostip,port);
    }
    public void sendText(String kto,String text) throws IOException {
        PrintWriter komunikacia = new PrintWriter(this.socket.getOutputStream(),true);
        //komunikacia.println(kto+"::"+text);
        komunikacia.println(kto);
        komunikacia.println(text);
        komunikacia.flush();
    }
    public String receivedText() throws IOException{
        Scanner textReceived = new Scanner(this.socket.getInputStream());
        String textRec = textReceived.nextLine();
        return textRec;
    }
}
