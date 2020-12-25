package automacao.steps;

import automacao.funcionalidade.BuscaKabum;
import automacao.util.ChromeContext;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class BuscaKabumStep extends ChromeContext {

	private BuscaKabum buscaKabum;

	public BuscaKabumStep() {
		buscaKabum = new BuscaKabum();
	}

	@Dado("^que tenho uma rota valida para o site da \"([^\"]*)\"$")
	public void que_tenho_uma_rota_valida_para_o_site_da(String site) throws Throwable {
		startWebDriver();

		switch (site.toUpperCase()) {

		case "KABUM":
			inputURL("https://www.kabum.com.br/");
			break;

		default:
			break;
		}

	}

	@Dado("^realizo a busca da placa de video \"([^\"]*)\"$")
	public void realizo_a_busca_da_placa_de_video(String nomeBusca) throws Throwable {
		buscaKabum.preencherBusca(nomeBusca);
		buscaKabum.clicarPesquisar();
	}

	@Quando("^armazeno os dados$")
	public void armazeno_os_dados() throws Throwable {
		buscaKabum.recuperarListaPrecoPagina();
	}

	@Quando("^finalizo a busca$")
	public void finalizo_a_busca() throws Throwable {
		stopWebDriver();
	}

}
