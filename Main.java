public class Main {
	public static void main(String[] args) {
		// This is a comment
		System.out.println("Hello World!"); // This is also a comment

		// String Assigning and Output
		String name = "John";
		System.out.println(name);

		// Int Variable Assigning
		int myNum = 15;
		System.out.println(myNum);

		// Int Variable without assigning
		int myNum2;
		myNum2 = 15;
		System.out.println(myNum2);

		// Int Variable Override
		int myNum3 = 15;
		myNum3 = 20; // myNum is now 20
		System.out.println(myNum3);

		// // Final Int Error
		// final int myNum4 = 15;
		// myNum4 = 20; // This will generate an error
		// System.out.println(myNum4);

		// Text and String Merge
		String newName = "David";
		System.out.println("Hello " + newName);

		// String Merge
		String firstName = "John ";
		String lastName = "Doe";
		String fullName = firstName + lastName;
		System.out.println(fullName);

		// Declaring multiple variables using commas
		int x = 5, y = 6, z = 50;
		System.out.println(x + y + z);

		// Java Data Types
		int dtNum = 5; // Integer
		float dtFloatNum = 5.99f; // Floating point number
		char dtLetter = 'D'; // String Character 
		boolean dtBool = true; // Boolean Value
		String dtText = "Hello"; // Text
		
		System.out.println(dtNum);
		System.out.println(dtFloatNum);
		System.out.println(dtLetter);
		System.out.println(dtBool);
		System.out.println(dtText);

		// Byte
		byte dtByte = 100;
		System.out.println(dtByte);

		// Short
		short dtShort = 5000;
		System.out.println(dtShort);

		// Int
		int dtInt = 100000;
		System.out.println(dtInt);

		// Long
		long dtLong = 15000000000L;
		System.out.println(dtLong);

		// Float
		float dtFloat = 5.75f;
		System.out.println(dtFloat);

		// Double
		double dtDouble = 19.99d;
		System.out.println(dtDouble);

		// Boolean
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);
		System.out.println(isFishTasty);

		// Char
		char dtGrade = 'D';
		System.out.println(dtGrade);

		// String
		String dtString = "String Test";
		System.out.println(dtString);

		// Type Casting
		// Widening Casting
		int dtCastingWide = 9;
		double dtCastingWideDouble = dtCastingWide; // Automatic Casting Int:Double
		System.out.println(dtCastingWide);
		System.out.println(dtCastingWideDouble);

		// Narrowing Casting
		double dtNarrowingDouble = 9.78d;
		int dtNarrowingInt = (int) dtNarrowingDouble; // Explicit Casting Int:Double
		System.out.println(dtNarrowingInt);
		System.out.println(dtNarrowingDouble);

		// Operators
		// Addition
		int a = 5;
		int b = 3;
		System.out.println(a+b);

		// Subtraction
		int c = 5;
		int d = 3;
		System.out.println(c-d);

		// Multiplication
		int e = 5;
		int f = 3;
		System.out.println(e*f);

		// Division
		int g = 5;
		int h = 3;
		System.out.println(g/h);

		// Modulus
		int i = 5;
		int j = 3;
		System.out.println(h%i);

		// Increment
		int k = 5;
		++k;
		System.out.println(k);

		// Decrement
		int l = 5;
		--l;
		System.out.println(l);

		// Assignment
		int m = 3;
		System.out.println(m);

		// Comparison
		int n = 5;
		int o = 3;
		System.out.println(n==o); // Returns false, 5 is not equal to 3

		// Logical
		int p = 5;
		System.out.println(p > 3 && p < 10); // Returns true, 5 is greater than 3 AND 5 is less than 10
		
		
		
	}
}

/*
This is a multi-line comment
*/
