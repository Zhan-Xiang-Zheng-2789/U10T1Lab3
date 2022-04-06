import java.util.Scanner;

public class Main // changed for this problem -- comment out last problem
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(hours);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static long numBacteriaAlive(int hour)
    {
        if(hour == 0){
            return 10;
        }
        return numBacteriaAlive(hour-1) + (numBacteriaAlive(hour-1) * 2);
    }
}


/*import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int inputNum = 0;

        while (inputNum != -1)
        {
            System.out.print("Please enter numbers. Enter -1 to quit: ");
            inputNum = input.nextInt();
            if (inputNum != -1)
            {
                numbers.add(inputNum);
            }
        }

        int minimum = findMinimum(numbers);  // call to findMinimum method
        System.out.println("Minimum: " + minimum);
    }

    public static int findMinimum(ArrayList<Integer> numbers)
    {
        if(numbers.size() == 1) {
            return numbers.get(0);
        }
        else {
            int temp = numbers.remove(0);
            return Math.min(temp, findMinimum(numbers));
        }
    }
}*/
