package com.cier.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        // 创建 socket,并将 socket 绑定到 65000 端口
        ServerSocket ss = new ServerSocket(65000);
        // 死循环，使得 socket 一直等待并处理客户端发送过来的请求
        while (true) {
            // 监听 65000 端口，直到客户端返回连接信息后才返回。
            Socket socket = ss.accept();
            new LengthCalculator(socket).start();
        }
    }
}
