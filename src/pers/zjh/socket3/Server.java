package pers.zjh.socket3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("监听在端口号: 8888");
            Socket socket = serverSocket.accept();

            //启动发送消息线程
            new SendThread(socket).start();

            //启动消息接收线程
            new ReceiveThread(socket).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
