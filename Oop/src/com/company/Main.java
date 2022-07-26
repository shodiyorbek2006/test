package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
       while (true){
           System.out.println("1->List");
           System.out.println("2->List edit");
           System.out.print("= ");
           int n = scanner.nextInt();
           if (n == 1) {
               System.out.println("== List ==");

               Fruit olma = new Fruit("Olma", 1500);
               olma.print();
               System.out.println("---------------");

               Fruit nok = new Fruit("Nok", 2500);
               nok.print();
               System.out.println("---------------");

               Fruit gilos = new Fruit("Gilos", 3500);
               gilos.print();
               System.out.println("---------------");


           }else if (n==2){
               System.out.println("== List edit ==");
               Fruit olma = new Fruit("Olma", 1500);
               olma.print();
               System.out.println("---------------");

               Fruit nok = new Fruit("Nok", 2500);
               nok.print();
               System.out.println("---------------");

               Fruit gilos = new Fruit("Gilos", 3500);
               gilos.print();
               System.out.println("---------------");
               System.out.println("= ");
               int l = scanner.nextInt();
               if (l==1){
                   System.out.println("So'mni kiriting: ");
                   int som = scanner.nextInt();

                   olma.setPrice(som);
                   olma.print();


               }else if (l==2){
                   System.out.println("So'mni kiriting: ");
                   int som = scanner.nextInt();
                   nok.setPrice(som);
               }



           }
       }
    }

}