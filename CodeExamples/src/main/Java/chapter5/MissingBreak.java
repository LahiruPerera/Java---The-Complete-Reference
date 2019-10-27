package main.Java.chapter5;

public class MissingBreak {
    public static void main(String args[]) {
        for (int i = 0; i < 12; i++)
            switch (i) {
                case 0:
                    System.out.println("i is zero.");
                case 1:
                    System.out.println("i is one.");
                case 2:
                case 3:
                case 4:
                    System.out.println("i is less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10");
                    break;
                default:
                    System.out.println("i is 10 or more");
            }
    }
}

/*
*
As you can see, execution falls through each case until a break statement (or the end of the
switch) is reached.
*
*/
