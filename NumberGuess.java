import java.util.Scanner;
import java.lang.Math;
class NumberGuess{
	Scanner sc=new Scanner(System.in);
	int n,k=5;
	void guess(){
		n=1+(int)(100*Math.random());
		while(k>0){
			int num;
			System.out.println("\n");
			System.out.println("Guess the Random Number generated -");
			num=sc.nextInt();
			if(num>n){
				System.out.println("Guessed number is greater than Random generated number");
				k--;
				System.out.println("number of attempts left for guessing are : "+k);
			}
			else if(num<n){
				System.out.println("Guessed number is lower than the Random generated number");
				k--;
				System.out.println(" Number of attempts left for guessing are : "+k);
			} 
			else{
				System.out.println("Hurray!! Your guess is correct");
				System.out.println("____YOU WON____");
				break;
			}
		}
		System.out.println("You are out of attempts!! There are no attempts left for you. . .");
		System.out.println("\n");
		System.out.println("The random number generated is - "+n);
		
	}
}
class Test{
	public static void main(String[] args){
		System.out.println(" ____NUMBER GUESSING GAME____");
		System.out.println("\n");
		System.out.println(" A number is generated randomly by the Computer between 1 to 100 and you have to guess it !! \n\n	You have 5 attempts to guess ");
		NumberGuess ng=new NumberGuess();
		ng.guess();
	}
}
		