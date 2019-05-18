package pers.zjh.pratice.socket2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Server {

    private static List<String> notUnderstand = new ArrayList<>();
    static {
        notUnderstand.add("听不懂");
        notUnderstand.add("请说机器语言");
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("监听在端口号:8888");
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        while(true){
            String message = dataInputStream.readUTF();
            System.out.println(message);

            List<Dictionary> dictionaries = new DictionaryDAO().query(message);
            String response = null;
            if(dictionaries.isEmpty()){
                Collections.shuffle(notUnderstand);
                response = notUnderstand.get(0);
            }else{
                Collections.shuffle(dictionaries);
                response = dictionaries.get(0).response;
            }
            dataOutputStream.writeUTF(response);
        }
    }
}
