package com.company.lesson16;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NetworkMain {
    public static void main(String[] args) throws IOException {
        InetAddress address = InetAddress.getByName("google.com");
        System.out.println(address);

        Socket socket = new Socket(address, 80);

        OutputStream os = socket.getOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(os);

        writer.write("GET / HTTP/1.1");
        writer.flush();

        InputStream is = socket.getInputStream();

        Scanner scanner = new Scanner(is);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }
}
