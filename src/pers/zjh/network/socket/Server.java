package pers.zjh.network.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8888);

        System.out.println("监听在端口号: 8888");
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        while(true){
            String message = dataInputStream.readUTF();
            System.out.println("收到客户端信息: " + message);
            Scanner scanner = new Scanner(System.in);
            String msg = scanner.next();
            dataOutputStream.writeUTF(msg);
        }

    }
}
