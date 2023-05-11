
public class board {
	
	// 8 x 8 size array to display the board
	char bd[][] = new char[8][8];
	
	public board(){			
		// Now let's initialize the board
		initialize_A();
		initialize_B();
		show_Board();
	}
	void initialize_A() {
		bd[0][0] = 'c';
		bd[0][1] = 'h';
		bd[0][2] = 'b';
		bd[0][3] = 'q';
		bd[0][4] = 'k';
		bd[0][5] = 'b';
		bd[0][6] = 'h';
		bd[0][7] = 'c';
		for(int i=0;i<8;i++) {
			bd[1][i] = 'p';
		}
	}
	void initialize_B() {
		bd[7][0] = 'c';
		bd[7][1] = 'h';
		bd[7][2] = 'b';
		bd[7][3] = 'q';
		bd[7][4] = 'k';
		bd[7][5] = 'b';
		bd[7][6] = 'h';
		bd[7][7] = 'c';
		for(int i=0;i<8;i++) {
			bd[6][i] = 'p';
		}
	}
	void show_Board() {
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print("" + bd[i][j]);
			}
			System.out.println();
		}
	}
}
