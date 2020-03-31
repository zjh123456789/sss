package pers.zjh.network.socket;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestSocket {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress inetAddress =InetAddress.getLocalHost();
        String ip = inetAddress.getHostAddress();
        System.out.println("本机ip地址为: " +ip);

    }
}
