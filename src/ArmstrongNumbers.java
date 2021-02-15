import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lowerRange = 0;
		int upperRange = 0;
		
		System.out.print("Lower Range - ");
		lowerRange = getInput();
		System.out.print("Upper Range -");
		upperRange = getInput();
		
		for(int n = lowerRange; lowerRange <= upperRange; n++){
			int Nx = n%10;
			
			if(Nx <> 0){
				int temp = N
			}
		}
	}
	
	private static int getInput(){
		int input; 
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		input = reader.nextInt();
		
		return input;
	}

}
