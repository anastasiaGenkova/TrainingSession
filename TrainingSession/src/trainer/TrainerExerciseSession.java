package trainer;

public class TrainerExerciseSession extends Training {

	@Override
	public
	TrainerExercise typeOfExercise(String name) {

		if(name == "GetUp") {
			return new GetUp();
		}
		
		if(name == "LieDown") {
			return new LieDown();
		}
		
		System.out.println("Unknown exercise: " + name);
		
		return null;
	}

}
