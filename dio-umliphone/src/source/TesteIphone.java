package source;

//TestIphone.java
public class TesteIphone {
 public static void main(String[] args) {
     Iphone meuIphone = new Iphone();


     meuIphone.ligar("123456789");
     meuIphone.atender("987654321");
     meuIphone.IniciarCorreioVoz("1122334455");

     meuIphone.selecionarMusica("Minha Canção Favorita");
     meuIphone.tocar();
     meuIphone.pausar();


     meuIphone.exibirPagina("www.exemplo.com");
     meuIphone.adicionarNovaAba("www.novapagina.com");
     meuIphone.atualizarPagina();
 }
}
