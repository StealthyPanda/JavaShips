import java.util.*;
//import java.util.IO.*;

class Start{

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Console.println("\nWelcome to BattleShips!(Tm) in Java!");
		Console.println("Rules are simple: ");
		Console.println("Bomb all of the opponent\'s ships before they do and you win!");
		Console.println("Ready? Press enter to start.");

		stop();

		Console.print("Enter Player1\'s nickname: "); char[] nick1 = stop().toCharArray();
		Console.print("\nEnter Player2\'s nickname: ");	char[] nick2 = stop().toCharArray();
		Console.println(nick1 + " and " + nick2);

		stop();



	}

	static String stop(){
		return input.nextLine();
	}


}
