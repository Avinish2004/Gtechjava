class staticExample
{
  
  //Static method
    static void static_Example()
 {
  System.out.println("hello. This is static function");
 }
  //Instance Method
  void instance_example()
 {
  System.out.println("This is a instance function  example");
 }
  public static void main(String args[])
   {
     static_example();
     StaticExample se  =  new StaticExample();
     se.instance_example();
   }
}