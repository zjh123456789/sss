package pers.zjh.pratice.socket3;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost",8888);

            //启动消息发送线程
            new SendThread(socket).start();

            //启动消息接收线程
            new ReceiveThread(socket).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
