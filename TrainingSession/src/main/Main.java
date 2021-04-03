package main;

import trainer.TrainerExercise;
import trainer.Training;
import trainer.TrainingSession;
import watcher.Exercise;
import watcher.ExerciseWatchers;
import watcher.Watcher;
import workouter.Command;
import workouter.GetUpCommand;
import workouter.LieDownCommand;
import workouter.Position;
import workouter.RemoteController;

public class Main {

	public static void main(String[] args) {
		Training trainerExerciseSession = TrainingSession.typeOfTraining("GetUp_LieDown");
		TrainerExercise getUp = trainerExerciseSession.typeOfExercise("GetUp");
		TrainerExercise lieDown = trainerExerciseSession.typeOfExercise("LieDown");
		RemoteController remoteController = new RemoteController();
		Position position = new Position();		
		Command GetUpCommand = new GetUpCommand(position);
		Command LieDownCommand = new LieDownCommand(position);
		Exercise exercise = new Exercise();
		Watcher watcher1 = new ExerciseWatchers("Watcher 1");
		Watcher watcher2 = new ExerciseWatchers("Watcher 2");
		Watcher watcher3 = new ExerciseWatchers("Watcher 3");
		exercise.watches(watcher1);
		exercise.watches(watcher2);
		exercise.watches(watcher3);		
		
		getUp.make();
		remoteController.makeCommand(GetUpCommand);
		remoteController.getCommand();
		exercise.makeExerciseName("gets up");
		
		lieDown.make();		remoteController.makeCommand(LieDownCommand);
		remoteController.getCommand();
		exercise.makeExerciseName("lies down");

	}

}
