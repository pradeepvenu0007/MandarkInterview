package com.interview.assesments.mandark;

import java.util.Arrays;
import java.util.Scanner;

public class Manhattan {
    public static void main(String[] args) {
        System.out.println();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter start point");
        int[] startPoint=new int[2];
        startPoint[0]=input.nextInt();
        startPoint[1]=input.nextInt();
        System.out.println("Enter path directions");
        String path=input.next();
        int[] endPoint=calculateEndPoint(startPoint,path.toUpperCase());
        System.out.printf("%.1f",calculateDistance(startPoint,endPoint));
    }
    public static int[] calculateEndPoint(int[] startPoint,String path)
    {
    	
    	int[] endPoint=startPoint.clone();
        for(char c:path.toCharArray())
        {
            switch (c){
                case 'N':
                    endPoint[1]++;
                    break;
                case 'E':
                    endPoint[0]++;
                    break;
                case 'W':
                    endPoint[0]--;
                    break;
                case 'S':
                    endPoint[1]--;
                    break;
                default:
                	System.out.println("Invalid direction");
            }
        }
        return endPoint;
    }
    public static double calculateDistance(int[] startPoint,int[] endPoint)
    {
        return Math.sqrt((Math.pow(startPoint[0]-endPoint[0],2))+(Math.pow(startPoint[1]-endPoint[1],2)));
    }
}
