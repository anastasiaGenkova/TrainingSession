package watcher;

public class ExerciseWatchers implements Watcher {

	
	private String name;
	private Watching exercise;
	
	public ExerciseWatchers(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.exercise == null) {
			System.out.println(this.name + " no exercise");
			return;
		}
		String exerciseName = this.exercise.getUpdate();
		System.out.println(this.name + " " + exerciseName);
	}

	@Override
	public void makeExercise(Watching exercise) {
		this.exercise = exercise;
	}
}