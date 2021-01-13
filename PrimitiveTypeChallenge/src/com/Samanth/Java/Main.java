package com.Samanth.Java;

public class Main {

    public static void main(String[] args) {
        SpeedConverter.printConversion(160.43);

        long Miles = SpeedConverter.toMilesPerHour(160.56);
        System.out.println( " miles = " +Miles);



//	    byte ByteValue = 10;
//	    short ShortValue = 20;
//	    int IntValue = 50;
//	    long TotalLong = 50000L + 10L *(ByteValue+ShortValue+IntValue);
//		System.out.println("Long value is " + TotalLong);
//
//		double pounds = 200d;
//		double kilograms = pounds * 0.45359237d;
//		System.out.println("kg : " +kilograms);

//		double var1 = 20.00;
//		double var2 = 80.00;
//
//		double Sum = (var1+var2) * 100.00;
//		System.out.println(Sum);
//
//		double rem = Sum % 40.00;
//		System.out.println(rem);
//		boolean bol = (rem==0)?true:false;
//		System.out.println(bol);
//		if(!bol){
//			System.out.println("got some reminder");
////		}
//		boolean gameOver = true;
//		int score =800;
//		int levelCompleted = 5;
//		int bonus = 100;
//
//		if(gameOver){ int finalScore = score + (levelCompleted * bonus);
//			System.out.println(finalScore);
//		}
//		int finalScore = 0;
//		int savedFinalscore = finalScore;
//		System.out.println("SavedScore: " + savedFinalscore);


    }
}
