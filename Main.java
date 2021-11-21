/*
 * Copyright (c) George O'Malley [aka "Gommeh"] 2021.
 * All rights reserved unless otherwise applicable under law.
 * Unauthorized use of this program or its code will result in me hunting you down
 * relentlessly, probably either online or in court. I really don't want to do that, so
 * please just do yourself a favor and don't steal my stuff. If you do go ahead and
 * use my code without authorization, you are subjecting yourself to my unending,
 * merciless, evil wrath. So, just don't steal my stuff, on pain of death.
 *
 * To contact me and ask if it's OK to use my stuff, you can either use a messenger
 * pidgeon, or contact me by email at gomalley411@gmail.com.
 */

package com.gommeh.dnd;

public class Main {

    public static void main(String[] args) {
        /* A note for using modifiers:
         * This program WILL NOT WORK if you don't include
         * a space before the + or - sign before the modifier!
         *
         * Correct example: 3d20 +1
         * Incorrect example: 3d20+1
         */

        if (args.length > 1) {
            if (!args[0].equals("roll")) throw new IllegalArgumentException();
            if (args[1].contains("d")) {
                String[] otherstuff = args[1].split("d");
                int numDice = Integer.parseInt(otherstuff[0]);
                System.out.println("Rolling...");
                int[] rolls = new int[numDice];
                int range = (Integer.parseInt(otherstuff[1]));

                // check to see if query has a modifier
                boolean hasModifier = false;
                if (args.length >= 2) {
                    if (args[1].contains("+") || args[1].contains("-")) {
                        //System.out.println("We have a modifier");
                        hasModifier = true;
                    }
                }

                //System.out.println("Ranging from 1 to " + range);
                for (int i = 0; i < numDice; i++) {
                    rolls[i] = (int) ((Math.random() * (range - 1)) + 1);

                    // takes into account modifiers if there are any
                    if (args.length >= 2 && hasModifier) {
                        int modifier = 0;
                        if (args[2].charAt(0) == '+') {
                            modifier = Integer.parseInt(String.valueOf(args[2].charAt(1)));
                        }
                        else if (args[2].charAt(0) == '-') {
                            modifier = Integer.parseInt(String.valueOf(args[2].charAt(1))) * -1;
                        }
                        //System.out.println("adding modifier of " + modifier);

                        rolls[i] += modifier;
                    }

                    // correcting if rolls[i] is outside the acceptable range
                    if (rolls[i] <= 0) rolls[i] = 1;
                    else if (rolls[i] > range) rolls[i] = range;
                }
                System.out.println("Your rolls: ");
                for (int i = 0; i < rolls.length; i++) {
                    System.out.print(rolls[i] + " ");
                }
                System.out.println();
            }
        }
    }

}
