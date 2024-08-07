class Program2 {

public static void test () 
 {
   System.out.println("Test Method Start");
   demo();
   System.out.println("Test Method End");

 }

public static void main (String[] args )

  {
    System.out.println("Main method start");
    test();
  
    System.out.println("Main Method End");
  
  }

public static void demo()
 {
   System.out.println("Demo Method Start");
     Program1.bike();
   System.out.println("Demo method end");
 }

}