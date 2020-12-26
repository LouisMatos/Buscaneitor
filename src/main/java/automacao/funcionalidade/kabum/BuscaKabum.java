package automacao.funcionalidade.kabum;

import automacao.dto.kabum.Item;
import automacao.tela.kabum.TelaKabum;

public class BuscaKabum extends TelaKabum {

	private Integer qntItemPagina;
	private String inicioDescricaoItem = "Placa de Vídeo ";
	private Item item;

	public BuscaKabum() {
		item = new Item();
	}

	public void preencherBusca(String nomeBusca) {
		barraPesquisa().sendKeys(nomeBusca);
	}

	public void clicarPesquisar() {
		botaoPesquisar().click();
	}

	public void recuperarListaPrecoPagina() {
		qntItemPagina = recuperaQntItensPagina();

		for (int i = 1; i <= qntItemPagina; i++) {
			if (validarItemDisponivel(i)) {
				item.setDescricao(recuperarTextoLinkItem(i));
				item.setMarca(recuperarMarcaItem(recuperarTextoLinkItem(i)));
				item.setValorCheio(recuperarPrecoCheio(i));
				item.setValorDesconto(recuperarPrecoDesconto(i));
				System.out.println(item.toString());

			}
		}

		if (verificaPaginacaoProximo()) {
			botaoPaginacaoProximo().click();
			recuperarListaPrecoPagina();
		}

	}

	private String recuperarMarcaItem(String descricaoItem) {
		String aux = descricaoItem.replace(inicioDescricaoItem, "");
		return aux.substring(0, aux.indexOf(" "));
	}

	private boolean validarItemDisponivel(int i) {
		if (recuperarItemEstaDisponivel(i).toLowerCase().contains("icone_disponivel")) {
			return true;
		}
		return false;
	}

}
