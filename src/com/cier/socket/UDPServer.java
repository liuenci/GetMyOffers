package com.cier.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {

    public static void main(String[] args) throws Exception {
        // 服务端接受客户端发送的数据报
        DatagramSocket socket = new DatagramSocket(65001);
        byte[] buff = new byte[100];
        DatagramPacket packet = new DatagramPacket(buff, buff.length);
        // 接受客户端发送过来的内容，并将内容封装进 DatagramPacket 对象中
        socket.receive(packet);
        // 从 DatagramPacket 对象中获取到真正存储的数据
        byte[] data = packet.getData();
        // 将数据从二进制转换为字符串形式
        String content = new String(data, 0, packet.getLength());
        System.out.println(content);
        // 将要发送给客户端的数据转化为二进制
        byte[] sendedContent = String.valueOf(content.length()).getBytes();
        // 服务器给客户端发送数据报
        // 从 DatagramPacket 对象中获取数据的来源地址与端口号
        DatagramPacket packetToClent = new DatagramPacket(sendedContent, sendedContent.length, packet.getAddress(), packet.getPort());
        // 发送数据给客户端
        socket.send(packetToClent);
    }
}
