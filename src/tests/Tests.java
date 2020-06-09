package tests;

import empiricalTesting.Triangle;

public class Tests {
	
	public static void main(String[] args) {

		System.out.println("Test 1: " + "Invalid Input".equalsIgnoreCase(Triangle.triangleType("a", 2, 3)));
		System.out.println("Test 2: " + "Value of a is not in the range of permitted values".equalsIgnoreCase(Triangle.triangleType(-1, -2, -3)));
		System.out.println("Test 3: " + "Invalid Input".equalsIgnoreCase(Triangle.triangleType("1", "2", "3")));
		System.out.println("Test 4: " + "Invalid Input".equalsIgnoreCase(Triangle.triangleType(6, null, 8)));
		System.out.println("Test 5: " + "Invalid Input".equalsIgnoreCase(Triangle.triangleType(3.0, "A", "B")));
		System.out.println("Test 6: " + "Value of a is not in the range of permitted values".equalsIgnoreCase(Triangle.triangleType(250, 5, 3)));
		System.out.println("Test 7: " + "Not a triangle".equalsIgnoreCase(Triangle.triangleType(1,1,2)));
		System.out.println("Test 8: " + "Value of a is not in the range of permitted values".equalsIgnoreCase(Triangle.triangleType(2000, 2000, 2000)));
		System.out.println("Test 9: " + "Equilateral".equalsIgnoreCase(Triangle.triangleType(1, 1, 1)));
		System.out.println("Test 10: " + "Isosceles".equalsIgnoreCase(Triangle.triangleType(2, 2, 3)));
		System.out.println("Test 11: " + "Scalene".equalsIgnoreCase(Triangle.triangleType(4, 3, 5)));
		
	}
	
}
