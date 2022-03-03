/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
   feature301
	
# new changesd for feature301 by vamshi
// pre: list != null
	// post: return sum of elements
	// uses enhanced for loop
	public static int sumListEnhanced(int[] list)
	{	int total = 0;
		for(int val : list)
		{	total += val;
		}
		return total;
}
    development
