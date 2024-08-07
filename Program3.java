class Program3 
{

 public static void test(int x)
 {
   System.out.println("Test method start");
   System.out.println("Value from main method  "+x);
   System.out.println("Test method ends");
 }



 public static void main(String[] args)
  {
    System.out.println("Main method start");
    int y=200;
    test(y);
    System.out.println("Main method ends");

  }


}