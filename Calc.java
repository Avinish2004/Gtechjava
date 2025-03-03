import java.util.*;

public class Calc{
    public static void main(String[] args) {
      int X = 15;
      int Y = 10;
      int sum = X + Y;
      System.out.println("sum of " + X + " and " + Y + " is " +sum);
      int prod = X * Y;
      System.out.println("Product of " + X + " and " + Y + " is " +prod);
      int div = X / Y;
      int div1 = Y / X;
      int div2 = X % Y;
      System.out.println("Division of " + X + " and " + Y + " is " +div);
      System.out.println("Division of " + X + " and " + Y + " is " +div1);
      System.out.println("Division of " + X + " and " + Y + " is " +div2);
      int exp = (X*Y)/(X+Y);
      System.out.println(exp);

  }
}