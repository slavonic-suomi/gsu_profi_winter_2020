package com.company.lesson16;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3668, 0, InetAddress.getByName("localhost"));

        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();

        BufferedReader in  = new BufferedReader(new InputStreamReader(is));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(os));

        System.out.println("client request: " + in.readLine());

        out.write("Hello!\n");
        out.flush();



    }
}
