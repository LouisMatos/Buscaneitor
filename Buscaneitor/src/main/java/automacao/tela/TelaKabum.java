package automacao.tela;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automacao.util.ChromeContext;

public class TelaKabum extends ChromeContext {

	public WebElement barraPesquisa() {
		return getDriver().findElement(By.xpath("//input[@class=\"sprocura\"]"));
	}
	
	public WebElement botaoPesquisar(){
		return getDriver().findElement(By.xpath("//input[@id=\"bt-busca\"]"));
	}
	
	public WebElement listaPrecosPagina(){
		return null;
	}

}
