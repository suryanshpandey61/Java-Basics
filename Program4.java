class Program4
{
 
 public static void getSquare(int a)
 {
  int sq = a*a;
  System.out.println(+a+" Sqaure is :" +sq);
 }

 public static void getSum(int a,int b)
 {
  int sum = a+b;
  System.out.println("Sum of "+a+" & " +b+ " is: "+sum);
 }

 public static void getSubtract(int p,int q)
 {
   int sub=p-q;
   System.out.println("subtract of " +p+ " & " +q+ " is: " +sub);
 }

 public static void getMultiply(int a,int b)

 {
  int mul = a*b;
  System.out.println("multiply of " +a+ " & " +b+ "is: "+mul);
 }

 public static void main (String[]  args)
 
 {
  System.out.println("Main method start");
  getSquare(5);
  getSum(10,20);
  getSubtract(10,50);
  getMultiply(7,10);
  System.out.println("Main method ends");
 }

}