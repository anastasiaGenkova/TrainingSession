package watcher;

public class WatcherMain {

	public static void main(String[] args) {

		Exercise exercise = new Exercise();
		Watcher watcher1 = new ExerciseWatchers("Watcher 1");
		Watcher watcher2 = new ExerciseWatchers("Watcher 2");
		Watcher watcher3 = new ExerciseWatchers("Watcher 3");
		
		exercise.watches(watcher1);
		exercise.watches(watcher2);
		exercise.watches(watcher3);
		
		exercise.makeExerciseName("gets up");
		exercise.makeExerciseName("lies down");
	}
}
