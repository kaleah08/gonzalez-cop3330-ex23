package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? (y/n)");
        String firstString = input.next();

        if(firstString.equals("y")){
            System.out.print("Are the battery terminals corroded? (y/n)");
            String secondString = input.next();

            if(secondString.equals("y")){
                System.out.print("Clean terminals and try starting again.");
                return;
            }
            else if(secondString.equals("n")){
                System.out.print("Replace cables and try again.");
                return;
            }
        }
        else if(firstString.equals("n")){
            System.out.print("Does the car make a slicking noise? (y/n)");
            String thirdString = input.next();

            if(thirdString.equals("y")){
                System.out.print("Replace the battery.");
                return;
            }
            else if(thirdString.equals("n")){
                System.out.print("Does the car crank up but fail to start? ");
                String fourthString = input.next();

                if(fourthString.equals("y")){
                    System.out.print("Check spark plug connections.");
                    return;
                }
                else if(fourthString.equals("n")){
                    System.out.print("Does the engine start and then die? ");
                    String fifthString = input.next();

                    if(fifthString.equals("y")){
                        System.out.print("Does your car have fuel injection? ");
                        String sixthString = input.next();
                        if(sixthString.equals("y")){
                            System.out.print("Get it in service.");
                            return;
                        }
                        else if(sixthString.equals("n")){
                            System.out.print("Check to ensure the choke is opening and closing.");
                            return;
                        }
                    }
                    else if(fifthString.equals("n")){
                        System.out.print("This should not be possible.");
                        return;
                    }

                }
            }
        }
    }
}
