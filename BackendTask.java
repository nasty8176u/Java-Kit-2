package implementations.task;

import abstractions.task.DevelopingTask;

public class BackendTask extends DevelopingTask {

	@Override
	public String getDetails() {
		return "A task to develop a Server API.";
	}
}
