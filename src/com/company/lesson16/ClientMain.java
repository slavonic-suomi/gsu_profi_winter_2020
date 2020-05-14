package com.company.lesson16;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) throws IOException {
        Socket localhost = new Socket("localhost", 3668);

        InputStream is = localhost.getInputStream();
        OutputStream os = localhost.getOutputStream();


        BufferedReader in  = new BufferedReader(new InputStreamReader(is));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(os));

        out.write("Hello from client!\n");
        out.flush();

        System.out.println(in.readLine());
    }
}
