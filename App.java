import abstractions.Developer;
import abstractions.Frontender;
import implementations.BackenderImpl;
import implementations.FrontenderImpl;
import implementations.FullstackDeveloper;
import implementations.result.Gui;
import implementations.task.FrontendTask;

public class App {
    public static void main(String[] args) throws Exception {

        Developer[] developers = new Developer[] {

                new FrontenderImpl(),
                new BackenderImpl(),
                new FullstackDeveloper()
        };

        loadFrontendersOnly(developers, new FrontendTask());

        for (Developer developer : developers) {
            if (developer instanceof Frontender frontender) {
                if (frontender.canDevelop()) {

                    // The invocation of developGui() mtod!
                    Gui result = frontender.developGui();

                    System.out.println(result.getDescription());
                }
            }
        }

    }

    static void loadFrontendersOnly(Developer[] developers, FrontendTask task) {
        assert developers != null;
        assert task != null;

        for (Developer developer : developers) {
            if (developer instanceof Frontender frontender) {
                frontender.input(task);
            }
        }
    }
}
