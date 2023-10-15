package abstractions;

import implementations.result.ServerApi;

public interface Backender extends Developer {

	/**
	 * Разработать бэкенд-код в соответствии с текущим заданием.
	 * 
	 * @return Серверный код.
	 */
	ServerApi develoServerApi();
}