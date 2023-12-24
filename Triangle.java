public  class Triangle {
public static void main(String[] args) {

// define a, b, c as doubles - command line args

int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);

//check if sum of 2 variables is bigger than the 3rd

boolean	result = false;

if ((a + b > c) && (a + c > b) && (c + b > a))
{
	result = true;
}

//print a, b, c & result


System.out.println( a + ", " + b + ", " + c + ": " + result );
}
}
