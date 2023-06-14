import java.util.Scanner;
public class SwitchCaseDemo{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Day Number");
		int num = scanner.nextInt();

		String dayName = "";
		switch(num){
			case 1:
				dayName="Monday";
				break;
			case 2:
				dayName="Tuesday";
				break;
			case 3:
				dayName="Wednsday";
				break;
			case 4:
				dayName="Thursday";
				break;
			case 5:
				dayName="Friday";
				break;
			case 6:
				dayName="Saturday";
				break;
			case 7:
				dayName="Sunday";
				break;
			default:
				dayName = "Invalid Input";
		}

		System.out.println(num +" matching Day is "+dayName);		
	}	
}