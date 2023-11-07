package sample;


import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int w;
    int h;

    System.out.println("Input w");
    w = sc.nextInt();

    System.out.println("Input h");
    h = sc.nextInt();

    for (int j = 1; j <= h; j++) {
      for (int i = 1; i <= w; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  } }
