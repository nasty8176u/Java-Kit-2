package abstractions;

import implementations.result.Gui;

public interface Frontender extends Developer {

	/**
	 * Разработать фронтенд-код в соответствии с текущим заданием.
	 * 
	 * @return Код экранных форм.
	 */
	Gui developGui();
}
