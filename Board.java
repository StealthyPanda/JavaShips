//package BattleShips;

class Board{

	int r = 0;
	int c = 0;
	String[][] rows;
	String[] columns;

	public Board(int x, int y){
		r = x;
		c = y;

		rows = new String[r][];
		columns = new String[c];

		for (int i = 0; i < r; i++) {

			rows[i] = columns;
			
		}
	}

	void display(){

		for (int i = 0; i < r; i++){

			for (int x = 0; x < c; x++) {

				String[][] cr = rows[i];
				System.out.println(cr[x]);
				
			}
		}

	}





}