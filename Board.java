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

	void display(){

		for(int rows = 0; rows<r; rows++){
			for(int cols = 0; cols < c; cols++){
				System.out.print(board_array[rows][cols] + " ");
			}
			System.out.println();
		}


	}

	void setchar(char character){
		for(int rows = 0; rows<r; rows++){
			for(int cols = 0; cols < c; cols++){
				board_array[rows][cols] = character;
			}
		}

	}


	void setcharAt(char character, int now, int nol){
		now--;
		nol--;
		board_array[now][nol] = character;
	}

	char getcharAt(int now, int nol){
		now--;
		nol--;
		char retchar = board_array[now][nol];
		return retchar;
	}

}