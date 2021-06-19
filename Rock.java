package pack2;
import java.util.Random;
import java.util.Scanner;

public class Rock {
	public static void main(String[] args)
	{
	String personPlay=null; 
	String computerPlay=null; 
	int computerInt; 
	Scanner scan = new Scanner(System.in);
	Random generator = new Random();
	while(true) {
		System.out.println("Enter your play in uppercase(Rock  R,Paper  p,Scissors  S");
		personPlay=scan.nextLine();
		if(personPlay.equals("R")||personPlay.equals("P")||personPlay.equals("S")) {
			break;
		}
		System.out.println("enter valid play  \n");
	}
	scan.close();
	computerInt=generator.nextInt(4);
	switch(computerInt)
	{
	case 0:
		computerPlay="R";
		break;
	case 1:
		computerPlay="P";
		break;
	case 2:
		computerPlay="S";
		break;
		default:
			break;
	}
	System.out.println("computer play:"+computerPlay);
	if(personPlay.equals(computerPlay))
		System.out.println("it is a tie!");
	else if(personPlay.equals("R"))
	{
		if(computerPlay.equals("S"))
			System.out.println("Rock crushes scissors.you win!!'");
		else
			System.out.println("paper covers rock.you lose!!");
	}
	else if(personPlay.equals("S"))
	{
		if(computerPlay.equals("R"))
			System.out.println("Rock crushes scissors.you lose!!");
	
	else
		System.out.println("Scissors cuts paper.youwin!!");
	}
	if(computerPlay.equals("R"))
		System.out.println("Paper covers rock.you win!!");
	else
		System.out.println("Scissiors cuts paper.you lose!!");
}
}





		
		
	
			
			
