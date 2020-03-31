package pers.zjh.network.socket2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);

            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            System.out.println("欢迎来到我的世界，我是机器人! 目前可支持的输入如下: ");
            System.out.println("1. 你好");
            System.out.println("2. 你是做什么的");
            System.out.println("3. 你是男生还是女生");
            System.out.println("4. 揍你");

            while(true){
                Scanner scanner = new Scanner(System.in);
                String str = scanner.next();
                dataOutputStream.writeUTF(str);
                String msg = dataInputStream.readUTF();
                System.out.println(msg);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
