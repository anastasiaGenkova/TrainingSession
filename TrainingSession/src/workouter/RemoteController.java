package workouter;

public class RemoteController {

	private Command command;
	
	public void makeCommand(Command command) {
		this.command = command;
	}

	public void getCommand() {
		this.command.make();
	}
	
}
