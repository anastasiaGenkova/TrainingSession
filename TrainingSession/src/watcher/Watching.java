package watcher;

public interface Watching {
	void watches(Watcher watcher);
	void notWatches(Watcher watcher);
	void notifyWatchers();
	String getUpdate();
}
