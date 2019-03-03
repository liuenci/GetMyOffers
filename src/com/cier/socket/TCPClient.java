package com.cier.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) throws IOException {
        // 创建 socket，并指定连接的是本机的端口号为 65000 的服务器 socket
        Socket socket = new Socket("127.0.0.1",65000);
        // 获取输出流
        OutputStream os = socket.getOutputStream();
        // 获取输入流
        InputStream is = socket.getInputStream();
        // 将要传递给 server 的字符串转换为 byte 数组，并将数组写入到输入流中。
        os.write(new String("hello world").getBytes());
        int ch = 0;
        byte[] buff = new byte[1024];
        // buff 主要用来读取输入的内容，存成 byte 数组，ch 主要用来获取读取数组的长度
        ch = is.read(buff);
        // 将接收流的 byte 数组转换为字符串，这里是从服务器回发回来的字符串参数的长度。
        String content = new String(buff, 0, ch);
        System.out.println(content);
        // 不要忘记关闭输入输出流以及socket
        is.close();
        os.close();
        socket.close();
    }
}
