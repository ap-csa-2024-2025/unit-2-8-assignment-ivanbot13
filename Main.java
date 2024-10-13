import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // prob 1:
    System.out.println("Enter a positive integer: ");
    int num = sc.nextInt();
    printRandom3(num);

    // prob 2:
    System.out.println("Enter the first x-coordinate: ");
    double x1 = sc.nextDouble();
    System.out.println("Enter the second x-coordinate: ");
    double x2 = sc.nextDouble();
    System.out.println("Enter the first y-coordinate: ");
    double y1 = sc.nextDouble();
    System.out.println("Enter the second y-coordinate: ");
    double y2 = sc.nextDouble();
    calcSlope(x1, x2, y1, y2);

    // prob 3:
    System.out.println("Enter two doubles: ");
    x1 = sc.nextDouble();
    y1 = sc.nextDouble();
    roundedDist(x1, y1);
  }

  public static void printRandom3(int n)
  {
    int ran1 = (int)(Math.random() * (n + 1)) + 2;
    int ran2 = (int)(Math.random() * (n + 1)) + 2;
    int ran3 = (int)(Math.random() * (n + 1)) + 2;
    System.out.println("Random numbers: \n" + ran1 + "\n" + ran2 + "\n" + ran3);
  }
  
  public static void calcSlope(double x1, double x2, double y1, double y2)
  {
    double slope = (y2-y1)/(x2-x1);
    System.out.println("Slope: " + slope);
  }

  public static void roundedDist(double x, double y)
  {
    double distance = Math.abs((x-y));
    distance = (int)(distance + 0.5);
    System.out.println("Distance: " + distance);
  }

}
