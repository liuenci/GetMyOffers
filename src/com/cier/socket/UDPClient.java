package com.cier.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        // 客户端发送数据报给服务端
        DatagramSocket socket = new DatagramSocket();
        // 要发送给服务器的数据
        byte[] buf = "Hello World".getBytes();
        // 将 IP 地址封装成 InetAddress 对象
        InetAddress address = InetAddress.getByName("127.0.0.1");
        // 将要发送给服务器端的数据封装成 DatagramPacket 对象 需要填写上 ip 地址与端口号
        DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 65001);
        // 发送数据给服务器端
        socket.send(packet);
        // 客户端接收服务器端发送过来的数据报
        byte[] data = new byte[100];
        // 创建 DatagramPacket 对象用来存储服务器端发送过来的数据
        DatagramPacket receivedPacket = new DatagramPacket(data, data.length);
        // 将接收到的数据存储到 DatagramPacket 对象中
        socket.receive(receivedPacket);
        // 将服务器端发送过来的数据取出来并打印到控制台
        String content = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
        System.out.println(content);

    }
}
