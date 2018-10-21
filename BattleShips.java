//package BattleShips;

class BattleShips{
	public static void main(String[] args) {

		start();
		

		
	}

	static void start(){

		BattleBoard b_player1 = new BattleBoard();
		b_player1.setchar('O');
		b_player1.display();

	}


}


class BattleBoard extends Board{

	//private Board b_board;

	public BattleBoard(int x, int y){

		super(x, y);

	}

	public BattleBoard(){

		super(5, 5);

	}

}