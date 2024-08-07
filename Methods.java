class Methods 
{

  public static void test()
  {
    System.out.println("===========");
    System.out.println("start test method");
    System.out.println("End test method");
    System.out.println("===========");
  }

  public static void main (String[] args)
  {
   System.out.println("start main method");
   demo();
   System.out.println("end main method");
   System.out.println("===========");
  }

  public static void demo()
  {
  System.out.println("start demo method");
  test();
  System.out.println("End demo method");
  }


}