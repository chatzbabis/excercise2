package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.Interpretations.*;


public class InsertNumber {

    private String phoneNumbers;

    private ArrayList<Integer> phone;

    public static String insertPhone() {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the phone Number: ");

        String phone = sc.nextLine();  // Read user input

        return phone;
    }


        public static void internationalOrDomestic(String phone){

        if (phone.substring(0,1).equals("0")) {

            int indexOfThirdZero=3;
            int index=2;
            for (int i=0; i<3; i++) indexOfThirdZero = phone.indexOf('0', indexOfThirdZero);
            String left = phone.substring(0, indexOfThirdZero);
            String right;
            System.out.println(phone.substring(indexOfThirdZero+1,indexOfThirdZero+2));
            if (phone.substring(indexOfThirdZero+1,indexOfThirdZero+2).equals(" ")) {
                 right = phone.substring(indexOfThirdZero + 2);
            }else{
                right = phone.substring(indexOfThirdZero + 1);
            }


            ArrayList <Integer> phoneNumbersInList=phoneNumbersWithoutSpaces(right);
            interpretations(phoneNumbersInList,true);


        }
        else{

            ArrayList <Integer> phoneNumbersInList=phoneNumbersWithoutSpaces(phone);
            interpretations(phoneNumbersInList,false);
        }
    }



    public static ArrayList<Integer> phoneNumbersWithoutSpaces(String phoneNumbers){
        ArrayList<Integer> phone=new ArrayList<Integer>();
        String[] arrayOfNumberDigitGroups = phoneNumbers.split("\\s+");

        for (String digit:arrayOfNumberDigitGroups
             ) {
            phone.add(Integer.parseInt(digit));
        }
        return phone;
    }
}
