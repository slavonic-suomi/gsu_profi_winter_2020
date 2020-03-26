package com.company.lesson9;

import java.io.*;
import java.util.Scanner;

public class IOMain {
    public static void main(String[] args) throws IOException {
//        InputStream is = System.in;

        System.out.println(System.in.getClass());

        InputStream is = new FileInputStream("input.txt");

//        int value;
//        while ( (value = is.read()) != -1 ) {
//            System.out.println(value);
//        }
//        System.out.println(value);

//        is.close();

        byte[] buff = new byte[1024];
        int count = is.read(buff);

        String s = new String(buff);
        System.out.println(s);

        OutputStream os = System.out;

        os.write(buff, 0, count);

        os.write("asd".getBytes());

        Writer writer = new OutputStreamWriter(os);
        writer.write("qwe");
        writer.flush();

//        Reader reader = new InputStreamReader(System.in);
//        reader.re


//        for (int i = 0; i < count; i++) {
//            os.println(buff[i]);
//        }
    }
}
