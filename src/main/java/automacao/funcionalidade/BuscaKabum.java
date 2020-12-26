package automacao.funcionalidade;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automacao.tela.TelaKabum;

public class BuscaKabum extends TelaKabum {
	
	private List<WebElement> elementos;
	
	public BuscaKabum(){
		elementos = null;
	}

	public void preencherBusca(String nomeBusca) {
		this.barraPesquisa().sendKeys(nomeBusca);		
	}

	public void clicarPesquisar() {
		this.botaoPesquisar().click();
	}

	public void recuperarListaPrecoPagina() {
		elementos = this.listaPrecosPagina(); 
		
		Iterator<WebElement> itr = elementos.iterator();
		while(itr.hasNext()) {
			if(itr.next().findElement(By.xpath("//div[@class=\"sc-fznKkj fEpBwY\"]//img")).getAttribute("src").toLowerCase().contains("icone_disponivel")){
				System.out.println(itr.next().findElement(By.xpath("//div[@class=\"sc-fznxsB ksiZrQ\"]")).getText());
				System.out.println(itr.next().findElement(By.xpath("//div[@class=\"sc-fznWqX qatGF\"]")).getText());
			}
		}
		
//		for (int i = 0; i < elementos.size(); i++) {
//			
//			if(elementos.get(i).findElement(By.xpath("//div[@class=\"sc-fznKkj fEpBwY\"]//img")).getAttribute("src").toLowerCase().contains("icone_disponivel")){
//				System.out.println(elementos.get(i).findElement(By.xpath("//div[@class=\"sc-fznxsB ksiZrQ\"]")).getText());
//				System.out.println(elementos.get(i).findElement(By.xpath("//div[@class=\"sc-fznWqX qatGF\"]")).getText());
//			}
//		}
		
//		for (WebElement webElement : elementos) {
//			
//			if(webElement.findElement(By.xpath("//div[@class=\"sc-fznKkj fEpBwY\"]//img")).getAttribute("src").toLowerCase().contains("icone_disponivel")){
//				System.out.println(webElement.findElement(By.xpath("//div[@class=\"sc-fznxsB ksiZrQ\"]")).getText());
//				System.out.println(webElement.findElement(By.xpath("//div[@class=\"sc-fznWqX qatGF\"]")).getText());
//			}
//		}
	}

}
