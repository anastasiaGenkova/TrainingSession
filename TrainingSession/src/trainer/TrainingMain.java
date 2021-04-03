package trainer;

public class TrainingMain {

	public static void main(String[] args) {

		Training trainerExerciseSession = TrainingSession.typeOfTraining("GetUp_LieDown");
		TrainerExercise getUp = trainerExerciseSession.typeOfExercise("GetUp");
		getUp.make();
		
		TrainerExercise lieDown = trainerExerciseSession.typeOfExercise("LieDown");
		lieDown.make();
	}
}
