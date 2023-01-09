package boardgame;

public class Piece {
	private Position position;
	protected Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	protected Board getBoard() {
		return board;
	}	
}
