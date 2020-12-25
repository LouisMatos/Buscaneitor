package automacao.tela;

import java.util.List;

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
	
	public List<WebElement> listaPrecosPagina(){
		return getDriver().findElements(By.xpath("//div[@id=\"listagem-produtos\"]//div[@class=\"sc-fzqARJ eITELq\"]"));
	}

}
