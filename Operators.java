
public class Operators {

	public static void main(String[] args) {
		int num1 = 152;
		int num2 = 24;
		int num3 = 394;
		
		// Addition 
		System.out.print("Addition : ");
		System.out.println(num1+num2+num3);
		
		// Subraction
		System.out.print("Subraction : ");
		System.out.println(num3-num2);
		
		// Multiplication
		System.out.print("Product : ");
		System.out.println(num1 * num3);
		
		// Division
		System.out.print("Division : ");
		System.out.println(num3 / num2);
		
		// Remainder / Modulo operator
		System.out.print("The Remainder : ");
		System.out.println(num1 / num2);
		
		
		// Relational Operator
		
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 -= num2);
		System.out.println(num1 += num2);
		System.out.println(num1 *= num2);
		
		// Logical AND operator
		System.out.println(num1 == num2 && num1 > num3);
		
		//m Logical OR operator
		System.out.println(num1<num2 || num3 == num2);
		
		
		
		// Increment and Decrement operator\
		System.out.println("Original value of num1 and num2 : ");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("values after incrementing num1 and numn2 : ");
		num1++;
		num2--;
		System.out.println(num1);
		System.out.println(num2);
		

	}

}
