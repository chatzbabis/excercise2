package com.company;

import java.util.ArrayList;
import java.util.List;

public class InsertNumber {

    private String phoneNumbers;

    private ArrayList<Integer> phone;

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
