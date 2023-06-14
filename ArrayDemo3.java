public class ArrayDemo3{
	public static void main(String[] args){
	 int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	int[] evens = new int[12];
	int[] odds = new int[12];
	int a = 0, b = 0;
	for(int i : numbers){
		if(i % 2 == 1)
			odds[a++] = i;
		else
			evens[b++] = i;
	}

	System.out.println("Odd Numbers");
	for(int i : odds)
		System.out.println(i);

	System.out.println("Even Number");
	for(int k : evens)
		System.out.println(k);
	}
}