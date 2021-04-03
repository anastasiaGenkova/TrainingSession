package trainer;

public class TrainingSession {
	
	public static Training typeOfTraining(String name) {
		
		if(name == "GetUp_LieDown") {
			return new TrainerExerciseSession();
		}
		
		System.out.println("unknown training: " + name);
		return null;
	}
	
}
