package com.example.tiffin.utils;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }

    public static int getInt(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }

    public static double getDouble(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextDouble();
    }

    public static void close() {
        scanner.close();
    }
}
