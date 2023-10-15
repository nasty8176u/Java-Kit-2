package implementations;

import abstractions.Backender;
import abstractions.task.DevelopingTask;
import implementations.result.ServerApi;
import implementations.task.BackendTask;

public class BackenderImpl implements Backender {

	private BackendTask task;

	@Override
	public void input(DevelopingTask technicalTask) {
		if (technicalTask instanceof BackendTask backendTask) {
			task = backendTask;
		}
	}

	@Override
	public boolean canDevelop() {
		return task != null;
	}

	@Override
	public ServerApi develoServerApi() {

		if (canDevelop()) {
			return new ServerApi() {
				// ...
			};
		}

		return null;
	}
}
