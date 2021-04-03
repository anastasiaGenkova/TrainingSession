package workouter;

public class CommandMain {

	public static void main(String[] args) {

		RemoteController remoteController = new RemoteController();
		Position position = new Position();
		
		Command GetUpCommand = new GetUpCommand(position);
		Command LieDownCommand = new LieDownCommand(position);

		remoteController.makeCommand(GetUpCommand);
		remoteController.getCommand();
		
		remoteController.makeCommand(LieDownCommand);
		remoteController.getCommand();
	}
}