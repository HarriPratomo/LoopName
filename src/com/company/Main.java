package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int limit;
        int x = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah pengulangan :");
        limit = input.nextInt();

        while (x < limit) {
            System.out.println("Namamu");
            x++;
        }
    }
}
