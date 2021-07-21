package Wikipedia;

import java.util.ArrayList;
import java.util.List;

public class WikiLetraInicial extends FiltroWikipedia {



	@Override
	protected List<WikipediaPage> filtradoEspecial(WikipediaPage page, List<WikipediaPage> paginas) {
		// TODO Auto-generated method stub
		List<WikipediaPage> similarPages= new ArrayList<WikipediaPage>();

		
		
		for (int i=0;i<paginas.size();i++)
			
		if  (page.getTitle().charAt(0) == paginas.get(i).getTitle().charAt(0)) {
			
			similarPages.add(paginas.get(i));
		}
		
		return  similarPages;
	}
 

}
