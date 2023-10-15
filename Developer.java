package abstractions;

import abstractions.task.DevelopingTask;

public interface Developer {

	/**
	 * Предоставляет техническое задание разработчику.
	 * 
	 * @param technicalTask Техническое задание.
	 */
	void input(DevelopingTask technicalTask);

	/**
	 * Проверяет, может ли разработчик выполнить задание.
	 * 
	 * @return true, если разработчик имеет задание и готов к работе;
	 *         false, если разработчик не имеет задания или данное задание
	 *         не может быть им выполнено.
	 */
	boolean canDevelop();
}
