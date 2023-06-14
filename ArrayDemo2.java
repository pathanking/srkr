public class ArrayDemo2{
	public static void main(String[] args){
		int[] integers = new int[5];
		integers[0] = 11;
		integers[1] = 22;
		integers[2] = 33;
		integers[3] = 44;
		integers[4] = 55;

		for(int i: integers)
			System.out.println(i);


		int[] integers2 = {1,2,3,4,5};
		System.out.println("Length of integers2 "+integers2.length);


		int[] integers3 = new int[]{2,5,7,9};
		System.out.println("Length of integers3 "+integers3.length);
		
		for(int i: integers3)
			System.out.println(i);
	}
}







