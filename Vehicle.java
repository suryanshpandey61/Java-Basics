class Vehicle{
 
 static int a=10;
 public static void main (String[] args)
 {
  int a=20;
  System.out.println("Value of a inside the main method is "+a);

  //static method me static value call by class name refrence
  System.out.println("Value of a Outside the main method is "+Vehicle.a);

  Scope.test();
 }


}