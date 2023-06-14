public class ArrayDemo{
	public static void main(String[] args){
		int[] integers = new int[5];
		integers[0] = 11;
		integers[1] = 22;
		integers[2] = 33;
		integers[3] = 44;
		integers[4] = 55;

		for(int x : integers)
			System.out.println(x);
	}
}