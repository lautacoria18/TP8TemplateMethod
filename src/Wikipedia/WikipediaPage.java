package Wikipedia;

import java.util.List;
import java.util.Map;

public  class WikipediaPage implements IWiki {
	
	private String titleP;
	private List<WikipediaPage> links;
	private Map<String, WikipediaPage> infobox;
	
	
	public WikipediaPage(String title, List<WikipediaPage> linkss, Map<String, WikipediaPage> info) {
		titleP= title;
		links= linkss;
		infobox= info;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return titleP;
	}

	@Override
	public List<WikipediaPage> getLinks() {
		// TODO Auto-generated method stub
		return links;
	}

	@Override
	public Map<String, WikipediaPage> getInfobox() {
		// TODO Auto-generated method stub
		return infobox;
	}
	

	

}
