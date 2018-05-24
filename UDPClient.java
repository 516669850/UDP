package UDP;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException{
        InetAddress address = InetAddress.getByName("localhost");
        int port = 8800;
        byte[] data = "用户名：admin 密码：123".getBytes();
        DatagramPacket packet = new DatagramPacket(data,data.length,address,port);
        DatagramSocket socket = new DatagramSocket();
        socket.send(packet);
    }
}
