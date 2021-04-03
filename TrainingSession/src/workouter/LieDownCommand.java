package workouter;

public class LieDownCommand implements Command {

	private Position position;
	
	public LieDownCommand(Position position) {
		this.position = position;
	}

	@Override
	public void make() {
		this.position.changePositionToLieDown();
	}

}
