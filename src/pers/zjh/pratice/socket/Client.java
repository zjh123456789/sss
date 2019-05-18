package pers.zjh.pratice.socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost",8888);

        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        while(true){
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            dataOutputStream.writeUTF(str);
            String msg = dataInputStream.readUTF();
            System.out.println("收到服务端信息 " + msg);
        }
    }
}
