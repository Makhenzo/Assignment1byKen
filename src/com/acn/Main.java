package com.acn;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
	// write your code here
        String msg = null;
        String name = null;
        String difference = null;
        String oddEven = null;
        int userAge ;
        int appAge;
        int ageGap;

        Scanner scanner = new Scanner(System.in);

            msg="Please Enter your name please >>";
            System.out.println(msg);
             name = scanner.nextLine();


        Calendar cal =  Calendar.getInstance();

        int DayOrNight = cal.get(Calendar.AM_PM);

        if(DayOrNight != 1){

            msg ="Good Morning ";

            System.out.println(msg +" " + name);

        }else
            {
                msg ="Good Afternoon ";
                System.out.println(msg +" " + name);
            }

         msg= name + " " + "Please can you enter your age";
        System.out.println(msg);
        userAge = scanner.nextInt();

       // System.out.println("Good moring  " + name + DayOrNight);

        Random generate = new Random();

        appAge = generate.nextInt(90-18)+18;

        System.out.println("appAge is  " + appAge);

        if(appAge > userAge)
        {
            ageGap = appAge - userAge;
        }else{
              ageGap = userAge - appAge;
        }

        if(userAge > appAge  )
        {
            difference = "Older";
        }else
        {
            difference = "Younger";
        }

        if(appAge % 2 == 0)
        {
            oddEven = "Even";
        }else
        {
            oddEven = "Odd";
        }

        System.out.println("I'am " + ">>" + userAge + " " + "years old, which is  " + ageGap + " years " +difference+ " than you." );
        System.out.println("Twice my age would be " + (appAge * 2));
        System.out.println("My age is an " + oddEven + " number");
        System.exit(0);

    }
}
