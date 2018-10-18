//package BattleShips;

class BattleShips{
	public static void main(String[] args) {


		Board b = new Board(3, 4);
		b.setchar('X');
		b.display();
		System.out.println();
		b.setchar('O', 1, 2);
		b.display();
		System.out.println(b.getchar(2, 2));

		
	}


}