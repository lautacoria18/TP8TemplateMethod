package Wikipedia;

import java.util.List;

public abstract class FiltroWikipedia {

	
	public  List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> paginas){
		
		return filtradoEspecial(page, paginas);
		
	}

	protected abstract List<WikipediaPage> filtradoEspecial(WikipediaPage page, List<WikipediaPage> paginas);
	
	
}
