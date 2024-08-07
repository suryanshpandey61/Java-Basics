class NewVehicle 
{
 
  int x =100;

  public void test ()
   {
    System.out.println("Test \n method \n start");
    System.out.println(this.x);
    System.out.println("Test method ends");
   }

  public static void main (String[] args)
  {
    System.out.println("Main method start");

   //we make object to acces non static method or non static data
    NewVehicle v1 = new NewVehicle();
    v1.test();
    System.out.println("Main method end");

  }



}