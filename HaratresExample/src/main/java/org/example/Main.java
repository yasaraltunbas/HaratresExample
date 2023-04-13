package org.example;

import closenumberproblem.CloseNumberProblem;
import mergetool.Merge;
import shoppingbasket.ShoppingBasket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println("İlk Kelimeyi Giriniz:");
//        String firstContent = getStringFromScreen();
//        System.out.println("İkinci Kelimeyi Girin:");
//        String secondContent = getStringFromScreen();
//
//        Merge merge = new Merge();
//        String mergedContent = merge.merge(firstContent, secondContent);
//        System.out.println(mergedContent);

//        int[] array = getArrayFromScreen();
//        ShoppingBasket shoppingBasket = new ShoppingBasket();
//        //int[] a = {5, 6, 4, 3, 4};
//
//        int arrayContent = shoppingBasket.calculatePrice(array);
//        System.out.println(arrayContent);
//        System.out.println(shoppingBasket.getNonDiscountProduct());

        CloseNumberProblem closeNumberProblem = new CloseNumberProblem();
        int[] B = { 3, 1, 5, 23, 2, 4, 9, 10, 15, 31};
        closeNumberProblem.findCloses(B);

    }

    private static String getStringFromScreen() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int[] getArrayFromScreen() {
        System.out.println("Dizi Boyutunu Giriniz:");

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();


        int[] arr = new int[x];


        System.out.println("Dizi Elemanlarını Giriniz");


        for (int i = 0; i < arr.length; i++) {

            arr[i] = scanner.nextInt();


        }
        return arr;

    }

}



