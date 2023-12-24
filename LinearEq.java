public  class LinearEq {
public static void main(String[] args) {

// define a, b, c as doubles - command line args

double a = Double.parseDouble(args[0]);
double b = Double.parseDouble(args[1]);
double c = Double.parseDouble(args[2]);

//print equation

System.out.println(a + " *" + " x " + b + " = " + c);

//compute x and print its value

double x = (c - b)/a;

System.out.println("x = " + x);
}
}
