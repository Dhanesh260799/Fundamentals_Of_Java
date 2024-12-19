package basics;

public class TypeCasting {

	public static void main(String[] args) {
		
				// Type Casting
				int intValue = 100;
				// Implicit Type Casting from int to long
				long longValue = intValue;
				// Implicit Type Casting from long to double
				double doubleValue = longValue;
				
				System.out.println(intValue);
				System.out.println(longValue);
				System.out.println(doubleValue);
				
				double doubleValue1 = 200.56;
				
				// Explicit Type Casting from double to int
				int intValue1 = (int) doubleValue1;
				// Explicit Type Casting from int to byte
				byte byteValue = (byte) intValue1;
				System.out.println(doubleValue1);
				System.out.println(intValue);
				System.out.println(byteValue);
	}
}
