public  class Gen3 {
public static void main(String[] args) {

// define a, b as integers - command line args

int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);

//find max & min and define variables

int max = Math.max (a,b);   //8
int min = Math.min (a,b);   //5

//randomly receive 3 numbers. math.random gives you a number between 0 and 1 * the difference, extreme case Math.random = 0 ==> num1 = min

int num1 = (int) ((Math.random() * (max - min)) + min);
int num2 = (int) ((Math.random() * (max - min)) + min);
int num3 = (int) ((Math.random() * (max - min)) + min);

//define variable for minimum between first 2 numbers
int minimum1 = Math.min(num1,num2);

//define variable for minimum between second 2 numbers
int minimum2 = Math.min(minimum1,num3);

System.out.println(num1);
System.out.println(num2);
System.out.println(num3);

System.out.println("The minimal number generated is: " + minimum2);
}
}
