public  class Coins {
public static void main(String[] args) {

// Declares integers sum, quarters and cents

int sum = Integer.parseInt(args[0]);
int quarters = sum / 25; // integer for number quarters
int cents = sum % 25; // integer for remainder

System.out.println("Use " + quarters + " quarters and " + cents + " cents");
}
}
