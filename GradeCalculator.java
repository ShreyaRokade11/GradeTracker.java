import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter grades (type 'done' when finished):");
        while (true)
        {
            String input = scanner.next();
            if (input.equals("done"))
           {
                break;
            }
           else
             {
                try
                {
                    int grade = Integer.parseInt(input);
                    grades.add(grade);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Invalid input! Please enter a valid grade or 'done' to finish.");
                }
            }
        }

        if (grades.isEmpty())
       {
            System.out.println("No grades entered.");
            return;
        }

        double average = calculateAverage(grades);
        int highest = findHighestGrade(grades);
        int lowest = findLowestGrade(grades);

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }

    private static double calculateAverage(ArrayList<Integer> grades)
    {
        int sum = 0;
        for (int grade : grades)
       {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    private static int findHighestGrade(ArrayList<Integer> grades)
     {
        int highest = Integer.MIN_VALUE;
        for (int grade : grades)
        {
            if (grade > highest) 
           {
                highest = grade;
            }
        }
        return highest;
    }

    private static int findLowestGrade(ArrayList<Integer> grades)
  {
        int lowest = Integer.MAX_VALUE;
        for (int grade : grades)
           {
            if (grade < lowest)
           {
                lowest = grade;
            }
        }
        return lowest;
    }
}
