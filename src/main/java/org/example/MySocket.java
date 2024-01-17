package org.example;

import java.io.*;
import java.net.*;

public class MySocket {

    private ServerSocket serverSocket;

    public MySocket() throws IOException {
        serverSocket = new ServerSocket();
        serverSocket.setSoTimeout(10000);
        serverSocket.bind(new InetSocketAddress("0.0.0.0", 5355));
    }

    public void run() {
        try {
            System.out.println("Aguardando client na porta " + serverSocket.getLocalPort());
            Socket server = serverSocket.accept();

        } catch (SocketTimeoutException s) {
            System.out.println("Não conectou");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
