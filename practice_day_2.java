package com.company;

import java.util.Scanner;

public class practice_day_2 {
    //1. sum of first n natural numbers
   /* public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms you want to add");
        num=sc.nextInt();

        System.out.println("Sum of first "+num+"natural numbers= "+sum(num));
    }
     static int sum(int n){
        if(n==0)
            return  n;
        else
            return(n+sum(n-1));
    }*/
//2. reverse a number using recursion
    /*  public static void rev(int number){
          if(number<10){
              System.out.print(number);
              return;
          }
          else{
              System.out.print(number%10);
              rev(number/10);
          }
      }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        rev(sc.nextInt());
    }*/
//REVERSE A STRING
   /* public static String reversestring(String str){
        if((str==null)||(str.length()<=1))
            System.out.println(str);

         else
            System.out.print(str.charAt(str.length()-1));
            String substring=str.substring(0,str.length()-1);
            reversestring(substring);
        return substring;
    }

    public static void main(String[] args) {
        String str;
        System.out.println("enter your string");
        Scanner sc= new Scanner(System.in);
        str=sc.nextLine();
        String reversed=reversestring(str);
        System.out.println("The reversed string is:"+reversed);
    }
*/
// calculating area of rectangle and square

   /* public static void main(String[] args) {
        System.out.println("enter the type of object to find the area");
        System.out.println("\t1,rectangle");
        System.out.println("\t2, square");

        Scanner sc= new Scanner(System.in);
        int option= sc.nextInt();

        if(option==1){
            System.out.println("enter width of rectangle");
            int width= sc.nextInt();
            System.out.println("enter length of rectangle");
            int length= sc.nextInt();

            double area=width*length;
            System.out.println("The area of rectangle is "+area);
        }
        else if(option==2){
            System.out.println("enter side of square");
            int side= sc.nextInt();
            double area=side*side;
            System.out.println("The area of rectangle is "+area);
        }
        else
            System.out.println("no option available");
    }*/
    //GRADE CALCULATOR
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the name of student");
       String name=sc.nextLine();
       System.out.println("enter the roll number of student");
       int roll=sc.nextInt();
       System.out.println("enter the marks obtained");
       int marks= sc.nextInt();

       String grade="";
       if (marks >=90)
           grade="O";
       else if(marks>=80)
           grade="A1";
       else if(marks>=70)
           grade="A2";
       else if (marks>=60)
           grade="B1";
       else if (marks>=50)
           grade="B2";
       else if (marks>=40)
           grade="C1";
       else if(marks>=34)
           grade="P";
       else
           grade="F";

       System.out.println("the grade of the student is:"+grade);
       }
   }


