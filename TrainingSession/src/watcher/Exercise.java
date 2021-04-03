package watcher;

import java.util.ArrayList;
import java.util.List;

public class Exercise implements Watching {

	private List<Watcher> watchers = new ArrayList<>();
	private String exerciseName;
	
	@Override
	public void watches(Watcher watcher) {
		this.watchers.add(watcher);
		watcher.makeExercise(this);
	}

	@Override
	public void notWatches(Watcher watcher) {
		this.watchers.remove(watcher);
	}

	@Override
	public void notifyWatchers() {
		for(Watcher watcher: this.watchers) {
			watcher.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.exerciseName;
	}

	public void makeExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
		this.notifyWatchers();
	}

}
