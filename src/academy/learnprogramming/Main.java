package academy.learnprogramming;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        while(true) {
            SocketController socControl = new SocketController("localhost");
            /*Input pouzivatela*/
            Scanner scannerkto = new Scanner(System.in);String kto = scannerkto.nextLine();
            Scanner scanner = new Scanner(System.in);String vstup = scanner.nextLine();

            socControl.sendText(kto,vstup);
            String textReceived = socControl.receivedText();
            System.out.println(textReceived);
        }
    }
}
