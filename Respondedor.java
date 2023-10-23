import java.util.ArrayList;
import java.util.Random;
/**
 * A classe Respondendor representa um objeto gerador de respostas.
 * É usado para gerar uma resposta automática para uma string de entrada.
 * 
 * Traduzido por Julio César Alves - 2023.10.17
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Respondedor
{

    private Random gerador;
    
 
    private ArrayList<String> respostas;
    
    /**
     * Constrói um respondedor.
     */
    public Respondedor()
    {
    //    gerador = new Random();
 
     //   respostas = new ArrayList<String>();
     //   respostas.add("Isso parece estranho. Você poderia descrever com mais detalhes?");
    //    respostas.add("Nenhum outro cliente reclamou disso antes[^2^][2]. Qual é a configuração do seu sistema?");
    //    respostas.add("Poderia me dar mais informações sobre o problema?");
     //   respostas.add("Isso é abordado no manual[^5^][5]. Você já leu o manual?");
     //   respostas.add("Sua descrição é um pouco ruim[^7^][7]. Você tem um especialista com você que poderia descrever isso melhor?");
     //   respostas.add("Isso não é um bug, é uma funcionalidade!");
    //    respostas.add("Você poderia detalhar melhor isso?");
    //    respostas.add("Você já tentou executar o aplicativo no seu telefone?");
    //    respostas.add("Já verifiquei no StatckOverflow e ChatGPT e nem eles sabem como responder :(");
    
        gerador = new Random();
        respostas = new ArrayList<String>();
        respostas.add("Bem, nunca trava em nosso sistema. Deve ter algo a ver com o seu sistema. Conte mais sobre sua configuração.");
        respostas.add("Acredito que isso tem a ver com o seu hardware. Atualizar seu processador deve resolver todos os problemas de desempenho. Você tem algum problema com nosso software?");
        respostas.add("O desempenho foi bastante adequado em todos os nossos testes. Você está executando outros processos em segundo plano?");
        respostas.add("Bem, você sabe, todo software tem alguns bugs. Mas nossos engenheiros de software estão trabalhando muito para corrigi-los. Você pode descrever o problema com mais detalhes?");
        respostas.add("Este é um bug conhecido relacionado ao sistema operacional Windows. Por favor, informe à Microsoft. Não há nada que possamos fazer a respeito.");
        respostas.add("Este é um bug conhecido relacionado ao sistema operacional Mac. Por favor, informe à Apple. Não há nada que possamos fazer a respeito.");
        respostas.add("O custo de nosso produto é bastante competitivo. Você deu uma olhada e realmente comparou nossos recursos?");
        respostas.add("A instalação é realmente bastante simples. Temos muitos assistentes que fazem todo o trabalho para você. Você leu as instruções de instalação?");
        respostas.add("Se você ler atentamente os requisitos do sistema, verá que os requisitos de memória especificados são de 1,5 gigabyte. Você realmente deve atualizar sua memória.");
        respostas.add("Levamos o suporte ao Linux muito a sério. Mas há alguns problemas. A maioria está relacionada a versões incompatíveis do glibc. Você pode ser um pouco mais preciso?");
        respostas.add("Ah, o BlueJ, sim. Tentamos comprá-los há muito tempo, mas eles simplesmente não vendem… São pessoas teimosas. Não há nada que possamos fazer a respeito, desculpe.");
  

    }

    /**
     * Gera uma resposta aleatória.
     * @return Uma string que deveria ser exibida como resposta.
     */
    public String generateResponse(String perguntaUsuario) {
        if (perguntaUsuario.contains("travou") || perguntaUsuario.contains("travando")) {
            return respostas.get(0);
        } else if (perguntaUsuario.contains("lento") || perguntaUsuario.contains("desempenho")) {
            return respostas.get(1);
        } else if (perguntaUsuario.contains("bug") || perguntaUsuario.contains("erro")) {
            return respostas.get(3);
        } else if (perguntaUsuario.contains("windows")) {
            return respostas.get(4);
        } else if (perguntaUsuario.contains("mac")) {
            return respostas.get(5);
        } else if (perguntaUsuario.contains("caro")) {
            return respostas.get(6);
        } else if (perguntaUsuario.contains("instalação")) {
            return respostas.get(7);
        } else if (perguntaUsuario.contains("memória")) {
            return respostas.get(8);
        } else if (perguntaUsuario.contains("linux")) {
            return respostas.get(9);
        } else if (perguntaUsuario.contains("bluej")) {
            return respostas.get(10);
        } else {
            return "Desculpe, não entendi sua pergunta. Pode fornecer mais detalhes?";
        }
    }
}