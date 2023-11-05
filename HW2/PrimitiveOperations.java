public class PrimitiveOperations {
	public static void main(String[] args){
		int var1 = 5;
		double var2 = 3.5;
		System.out.println(var1);
		System.out.println(var2);

		double prod = var1 * var2;
		System.out.println(prod);

		double newvar1 = (double)var1;
		System.out.println(newvar1);

		int newvar2 = (int)var2;
		System.out.println(newvar2);

		char letter = 'B';
		System.out.println(letter);

		int ascii = (int)letter;
		ascii = ascii + 32;
		char lower = (char)ascii;
		System.out.println(lower);
	}
}