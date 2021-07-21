package Wikipedia;

import java.util.ArrayList;
import java.util.List;

public class WikiPropiedadEnComun extends FiltroWikipedia {



	@Override
	protected List<WikipediaPage> filtradoEspecial(WikipediaPage page, List<WikipediaPage> paginas) {
		// TODO Auto-generated method stub
		
		List<WikipediaPage> similarPages= new ArrayList<WikipediaPage>();
		
				for (int i=0;i<paginas.size();i++) {
			
			if (page.getInfobox().keySet().stream().anyMatch(paginas.get(i).getInfobox().keySet()::contains) ) {
			
			similarPages.add(paginas.get(i));
	}
				}
			return similarPages;
	}
	
}
