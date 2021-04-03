package workouter;

public class Position {

	private Boolean positionUp;
	
	public void changePositionToGetUp() {
		System.out.println("The workouter gets up");
		this.positionUp = true;
	}
	
	public void changePositionToLieDown() {
		System.out.println("The workouter lies down");
		this.positionUp = false;
	}
}
