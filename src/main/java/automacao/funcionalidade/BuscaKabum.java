package automacao.funcionalidade;

import automacao.tela.TelaKabum;

public class BuscaKabum extends TelaKabum {

	public void preencherBusca(String nomeBusca) {
		this.barraPesquisa().sendKeys(nomeBusca);		
	}

	public void clicarPesquisar() {
		this.botaoPesquisar().click();
	}

	public void recuperarListaPrecoPagina() {
		this.listaPrecosPagina();
	}

}
