import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Problem 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numbers to add. Enter -1 to stop");
    int num = 0;
    int sum = 0;
    while (num != -1)
    {
      num = sc.nextInt();
      sum += num;
    }
    sum++;
    System.out.println("The sun is: " + sum);

    // Problem 2
    System.out.println("How many inputs do you want?");
    int input = sc.nextInt();
    int count = 0;
    int N = 0;
    int max = 0;
    System.out.println("Enter numbers");
    while (count < input)
    {
      N = sc.nextInt();
      if (N > max)
      {
        max = N;
      }
      count = count + 1;
    }
    System.out.println("The maximum value is " + max + ".");

    //Problem 3
    String word;

    System.out.println("Input a word.");
    sc.nextLine();
    word = sc.nextLine();
    int counter = 1;

    int index = 0;
    while (index < word.length())
    {
      String currentLetter = word.substring(index, index+1);
      counter +=1;
      index++;
      if (counter == 3)
      {
        index++;
        counter = 1;
      }
      System.out.println(currentLetter);
    }
  }
}
