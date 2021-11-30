package com.company;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {




        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the question game.");
        System.out.println("Choose a difficulty: 1, 2, 3");
        int difficulty = scan.nextInt();
        if(difficulty == 1){
            int min = 1;
            int max = 20;
            int ran = (int) Math.floor(Math.random() * (max - min + 1) + min);
            int timesGuessed = 10;
        while(timesGuessed >= 1) {
            System.out.println("Guess a number between 1 and 20");
            int guess = scan.nextInt();
            if(guess>ran){
                System.out.println("Too high");
                timesGuessed --;
                System.out.println("Try again");
                System.out.println("You have " + timesGuessed + " more tries.");
            }
            if(guess<ran){
                System.out.println("Too low");
                timesGuessed --;
                System.out.println("Try again");
                System.out.println("You have " + timesGuessed + " more tries.");
            }
            if(guess == ran) {
                System.out.println("Nice job!");
                timesGuessed = 0;
            }
                }

            }
        if(difficulty == 2){
            int min = 1;
            int max = 50;
            int ran = (int) Math.floor(Math.random() * (max - min + 1) + min);
            int timesGuessed = 10;
            while(timesGuessed >= 1) {
                System.out.println("Guess a number between 1 and 50");
                int guess = scan.nextInt();
                if(guess>ran){
                    System.out.println("Too high");
                    timesGuessed --;
                    System.out.println("Try again");
                    System.out.println("You have " + timesGuessed + " more tries.");
                }
                if(guess<ran){
                    System.out.println("Too low");
                    timesGuessed --;
                    System.out.println("Try again");
                    System.out.println("You have " + timesGuessed + " more tries.");
                }
                if(guess == ran) {
                    System.out.println("Nice job!");
                    timesGuessed = 0;
                }
            }

        }
        if(difficulty == 3){
            int min = 1;
            int max = 99;
            int ran = (int) Math.floor(Math.random() * (max - min + 1) + min);
            int timesGuessed = 5;
            while(timesGuessed >= 1) {
                System.out.println("Guess a number between 1 and 99");
                int guess = scan.nextInt();
                if(guess>ran){
                    System.out.println("Too high");
                    timesGuessed --;
                    System.out.println("Try again");
                    System.out.println("You have " + timesGuessed + " more tries.");
                }
                if(guess<ran){
                    System.out.println("Too low");
                    timesGuessed --;
                    System.out.println("Try again");
                    System.out.println("You have " + timesGuessed + " more tries.");
                }
                if(guess == ran) {
                    System.out.println("Nice job!");
                    timesGuessed = 0;
                }
            }

        }


        }









    }






