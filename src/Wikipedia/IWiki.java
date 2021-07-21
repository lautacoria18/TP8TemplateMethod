package Wikipedia;

import java.util.List;
import java.util.Map;

public interface IWiki {

	
	String getTitle(); ///Devuelve el titulo
	
	List<WikipediaPage> getLinks(); //Retorna la lista de paginas con las que se conecta
	
	Map<String, WikipediaPage> getInfobox(); //
}
