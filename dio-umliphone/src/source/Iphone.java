package source;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{
		
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o numero: " + numero + "\n");
	}
	@Override
	public void atender(String numero) {
		System.out.println("Atendendo o numero: " + numero + "\n");
	}
	@Override
	public void IniciarCorreioVoz(String numero) {
		System.out.println("Iniciando o correio de voz para o numero: " + numero + "\n");
	}
	@Override
	public void tocar() {
		System.out.println("Musica tocando\n");
	}
	@Override
	public void pausar() {
		System.out.println("Musica pausada\n");
	}
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando musica: " + musica + "\n");
	}
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina: "+ url + "\n");
	}
	@Override
	public void adicionarNovaAba(String url) {
		System.out.println("Adicionando pagina: "+ url + "\n");		
	}
	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina\n");
	}
	
}
