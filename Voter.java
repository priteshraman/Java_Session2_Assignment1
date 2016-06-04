import java.util.Scanner;
public class Voter{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		float b;
		System.out.println("please enter your age");
		b=sc.nextFloat();
		if(b>=18.0){
			System.out.println("you are eligible to vote.congrats");
		}
		else{
			System.out.println("you are NOT eligible to vote.sorry!!");
		}
		
}
}