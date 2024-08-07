class Scope {

 static int a=100;

 public static void test ()
 {
   System.out.println("Enter into the test method");
   int a=60;
   System.out.println("The Value inside a is"+a); 
 }

 public static void main (String[] args)
 {
  System.out.println("Enter in the main method");
  test();
  System.out.println("End of main method");
 
 }

}