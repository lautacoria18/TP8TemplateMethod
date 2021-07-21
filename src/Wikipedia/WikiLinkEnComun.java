package Wikipedia;

import java.util.ArrayList;
import java.util.List;

public class WikiLinkEnComun extends FiltroWikipedia {


	@Override
	protected List<WikipediaPage> filtradoEspecial(WikipediaPage page, List<WikipediaPage> paginas) {
		// TODO Auto-generated method stub
		List<WikipediaPage> similarPages= new ArrayList<WikipediaPage>();
		

		
		for (int i=0;i<paginas.size();i++) {
			
			if (page.getLinks().stream().anyMatch(paginas.get(i).getLinks()::contains) ) {
			
			similarPages.add(paginas.get(i));
			//prueba.add("si");
			}
		}
		return similarPages;
	}

	

	
	

}
