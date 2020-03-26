package com.company.lesson9;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int intVal;
//        intVal = sc.nextInt();
//        sc.nextLine();

        intVal = Integer.parseInt(sc.nextLine());
        String lineVal = sc.nextLine();

        System.out.println(intVal);
        System.out.println(lineVal);

        File file = new File("out.txt");
        boolean exists = file.exists();
        System.out.println(exists);

//        Path path = Paths.get("out.txt");
//        path.

        /*
        FileOutputStream fos = new FileOutputStream(file, true);
        OutputStreamWriter writer = new OutputStreamWriter(fos);

        writer.write(String.valueOf(intVal));
        writer.write(lineVal);

        writer.flush();

        fos.close();


         */

        try (FileOutputStream fos1 = new FileOutputStream(file, true);
             OutputStreamWriter writer1 = new OutputStreamWriter(fos1)) {

            writer1.write(String.valueOf(intVal));
            writer1.write(lineVal);
        }

    }
}
