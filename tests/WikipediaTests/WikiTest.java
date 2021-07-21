package WikipediaTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Wikipedia.WikiLetraInicial;
import Wikipedia.WikiLinkEnComun;
import Wikipedia.WikiPropiedadEnComun;
import Wikipedia.WikipediaPage;

class WikiTest {
	
	//Filtros
	private WikiLinkEnComun wikiLink;
	private WikiLetraInicial wikiLetra;
	private WikiPropiedadEnComun wikiProp;
	
	//Paginas
	private WikipediaPage wiki1;
	private WikipediaPage wiki2;
	private WikipediaPage wiki3;
	private WikipediaPage wiki4;	
	private WikipediaPage wiki5;
	private WikipediaPage wiki6;
	private WikipediaPage wiki7;
	private WikipediaPage wiki8;
	private WikipediaPage wiki9;
	private WikipediaPage wiki10;
	private WikipediaPage wiki11;
	private WikipediaPage wiki12;
	
	//Lista
	private List<WikipediaPage> wikiList;
	
	//Para corroborar
	private List<WikipediaPage> listaParaCorroborar;
	private List<WikipediaPage> listaParaCorroborar2;
	private List<WikipediaPage> listaParaCorroborar3;
	
	
	//ListaConLinks para la pagina
	private List<WikipediaPage> listaLink1;
	private List<WikipediaPage> listaLink2;
	private List<WikipediaPage> listaLink3;
	private List<WikipediaPage> listaLink4;
	private List<WikipediaPage> listaLink5;
	
	
	//Maps para la pagina
	private HashMap<String, WikipediaPage> infoBox = new HashMap<String, WikipediaPage>();
	private HashMap<String, WikipediaPage> infoBox2 = new HashMap<String, WikipediaPage>();
	private HashMap<String, WikipediaPage> infoBox3 = new HashMap<String, WikipediaPage>();
	private HashMap<String, WikipediaPage> infoBox4 = new HashMap<String, WikipediaPage>();

	
	@BeforeEach
	void setUp() {
		//Seteo filtro
		wikiLetra= new WikiLetraInicial();
		wikiLink= new WikiLinkEnComun();
		wikiProp= new WikiPropiedadEnComun();
		//sETEo de links para paginas
		listaLink1= new ArrayList<WikipediaPage>();
		listaLink2= new ArrayList<WikipediaPage>();
		listaLink3= new ArrayList<WikipediaPage>();
		listaLink4= new ArrayList<WikipediaPage>();
		listaLink5= new ArrayList<WikipediaPage>();
		

		
		//Seteo de paginas
		wiki1= new WikipediaPage("Raonic", listaLink1, infoBox);
		wiki2= new WikipediaPage("Nadal", listaLink2, infoBox);
		wiki3= new WikipediaPage("Djokovic", listaLink3, infoBox);
		wiki4= new WikipediaPage("Roddick", listaLink4, infoBox);
		wiki5= new WikipediaPage("Nalbandian", listaLink5, infoBox);
		wiki6= new WikipediaPage("Davydenko", listaLink1, infoBox);
		
		//Listas
		
		listaLink2.add(wiki1);
		listaLink2.add(wiki3);
		listaLink2.add(wiki4);
		
		listaLink3.add(wiki1);
		listaLink4.add(wiki1);
		
		
		wikiList= new ArrayList<WikipediaPage>();
		listaParaCorroborar= new ArrayList<WikipediaPage>();
		listaParaCorroborar2= new ArrayList<WikipediaPage>();
		listaParaCorroborar3= new ArrayList<WikipediaPage>();
		
		
		listaParaCorroborar.add(wiki4);

		listaParaCorroborar2.add(wiki3);
		listaParaCorroborar2.add(wiki4);
		
		listaParaCorroborar3.add(wiki3);
		listaParaCorroborar3.add(wiki4);
		

		wikiList.add(wiki3);
		wikiList.add(wiki4);
		
		
		infoBox.put("Tenis", wiki6);
		infoBox.put("Handball", wiki7);
		infoBox2.put("Basket", wiki8);
		infoBox2.put("Futbol", wiki9);
		}

	@Test
	void test() {
		assertEquals(listaParaCorroborar, wikiLetra.getSimilarPages(wiki1, wikiList));
		
	}
	
	@Test 
	void testLinksEnComun(){
		assertEquals(listaParaCorroborar2, wikiLink.getSimilarPages(wiki2, wikiList));
	}
	
	@Test
	void testInfoBox() {
		
		assertEquals(listaParaCorroborar3, wikiProp.getSimilarPages(wiki3, wikiList));
	}

}
