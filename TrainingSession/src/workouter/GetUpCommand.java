package workouter;

public class GetUpCommand implements Command {

	private Position position;
	
	public GetUpCommand(Position position) {
		this.position = position;
	}

	@Override
	public void make() {
		this.position.changePositionToGetUp();
	}

}
