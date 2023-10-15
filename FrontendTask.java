package implementations.task;

import abstractions.task.DevelopingTask;

public class FrontendTask extends DevelopingTask {

	@Override
	public String getDetails() {
		return "A task to develop a web-app GUI.";
	}

}
