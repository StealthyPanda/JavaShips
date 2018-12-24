//package BattleShips;

class Board{

	private int r = 0;
	private int c = 0;
	private char[][] board_array;

	public Board(int x, int y){
		r = x;
		c = y;

		board_array = new char[r][c];

	}

	//Prints board to console.(ithink?)
	void display(){

		for(int rows = 0; rows<r; rows++){
			for(int cols = 0; cols < c; cols++){
				System.out.print(board_array[rows][cols] + " ");
			}
			System.out.println();
		}


	}

	//Sets char of the board as character(?)
	void setchar(char character){
		for(int rows = 0; rows<r; rows++){
			for(int cols = 0; cols < c; cols++){
				board_array[rows][cols] = character;
			}
		}

	}

	//Obvious (?)
	void setcharAt(char character, int now, int nol){
		now--;
		nol--;
		board_array[now][nol] = character;
	}

	//here too
	char getcharAt(int now, int nol){
		now--;
		nol--;
		char retchar = board_array[now][nol];
		return retchar;
	}

}


//Makes things easier
class BattleBoard extends Board{

	//private Board b_board;

	public BattleBoard(char character){

		super(5, 5);
		this.setchar(character);

	}

}

//Misc things

class Console{


		public static void println(Object ob){
			System.out.println(ob);
		}

		public static void print(Object ob){
			System.out.print(ob);
		}

}
