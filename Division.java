class Division
{
   int num;
   int getNum()
   {
      return num;
   } 
  void setNum(int var)
   {
    if (var == 0)
      {
        num = 10;
      }
    else
     {
        num = var;
     }
   }
  public static void main(String args[])
  {
   Scanner scan = new Scanner(System.in);
   int num1 = scan.nextInt();
   int num2 = scan.nextInt();

   Division d  = new Division();
   d.setNum(num2);
   d.getNum();
  }
}