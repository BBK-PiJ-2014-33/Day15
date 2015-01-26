import java.util.Scanner;

class NumberReaderAverage {

    public int averageOfTen (int numberOfItems)
    {
        int count = numberOfItems;
        int result = 0;
        String str;
        int sum = 0;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input " + numberOfItems + " numbers to calculate average");

            while (count != 0) {
                try
                {
                    System.out.println("Please input next number");
                    str = myScanner.nextLine();
                    result = Integer.parseInt(str);
                    sum = sum + result;
                    count--;

                } catch (NumberFormatException ex)
                {
                    System.out.println("Your input is not a number. Try again");
                }
            }
        return sum/numberOfItems;
    }
}
