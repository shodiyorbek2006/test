package Lesson;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {


    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(in);


        System.out.println("Hush kelibsiz!!!");

        while (true) {

            System.out.println("Next -> 0");
            System.out.println("Exit -> 1");
            System.out.print("= ");
            int n = scanner.nextInt();

            if (n == 0) {

                System.out.println("List \n1-> Olma - 1500 so'm\n2-> Nok - 2000 so'm");


                System.out.println("Kg: ");

                int f = scanner.nextInt();

                System.out.println("Pulni kiriting: ");


            } else if (n == 1) {

                System.out.println("the end ");
                break;

            }else if (n==3){
                System.out.println("test");
            }
            else {
                System.out.println("error");

            }


        }






    }
}
