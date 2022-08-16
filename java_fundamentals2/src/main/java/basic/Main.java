package basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
       int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int carCount = 2;
        System.out.println("I own " + carCount + " " + pluralize("car", carCount) + ".");

        int snakeCount = 0;
        System.out.println("I own " + snakeCount + " " + pluralize("snake", snakeCount) + ".");

        filpNHeads(2);
        clock();
    }

    public static String pluralize(String item, int countNum){
        if (countNum == 0 || countNum > 1){
            return item + "s";
        } else {
            return item;
        }
    }

    public static void filpNHeads(int n){
        int count = 0;
        int headsCount = 0;
        int headsInRow[] = new int[n];

        while(headsCount < headsInRow.length){
            double randomRoll = Math.random();
            if(randomRoll < 0.5){
                System.out.println("tails");
            } else {
                System.out.println("heads");
                headsInRow[headsCount++] = 1;
            }
            count ++;
        }
        System.out.println("It took " + count + " " + "flips to flip " + n + " heads in a row.");
    }

    public static void clock(){
        int tSeconds = 0;
        while(true){
            LocalDateTime currentTime = LocalDateTime.now();
            int seconds = currentTime.getSecond();
            String time = currentTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            if(tSeconds != seconds){
                System.out.println(time);
            }
            tSeconds = seconds;
        }

    }


}
