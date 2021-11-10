package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> userNumb = new ArrayList<Integer>();
        ArrayList<Integer> ups = new ArrayList<Integer>();
        System.out.print("type in numbers: ");
        String userinput = input.next();
        for (int i = 0; i < userinput.length(); i++) {
            int number = Integer.parseInt(userinput.charAt(i) + "");
            userNumb.add(number);
        }
        System.out.println(userNumb);

        for (int i = 0; i < userNumb.size();i++){
            int trial = userNumb.get(i);
            System.out.println(trial);
            ups.add(trial);

            }
        }





        //(userNumb[1]).equals([2])
  //      Collections.reverse();
        //List of actual numbers  tick
        //List of the mirror
        //Some sort of comparison to look at length of list reminaing to mirror length
        //Some comparison of list length/2 compared to size of mirror
        //[1,2,9,6,4,6,9]
        //MaxMirror = 1
        //Longest mirror is 3


    }


// save number to other list
//check list for that number
// if have it +1 to mirror max
// save number next to it then look for that and then the other one (collection reverse ? ) to the left
//loop through that until reaches one that doesn't work