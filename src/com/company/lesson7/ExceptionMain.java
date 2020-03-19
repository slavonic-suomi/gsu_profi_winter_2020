package com.company.lesson7;

public class ExceptionMain {
    public static void main(String[] args)  {
        int i = 0;

        int result;

        calc2(0);

        try {
            result = calc(i);
            System.out.println("success!");
        } catch (ArithmeticException ae) {
            result = -2;
        } catch (Exception ae) {
            ae.printStackTrace();
            result = -1;
        }


        System.out.println(result);
    }

    public static int calc(Integer val) {
        if (val == null || val == 0) {
            throw new CustomException("my exception");
        }
        return 10 / val;
    }

    public static  int calc2(Integer val) {
        try {
            //file.close();
            return 10 / val;
        } finally {
            //file.close();
            System.out.println("it's finally");
        }
    }
}
