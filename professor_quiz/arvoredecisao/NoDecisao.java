package arvoredecisao;

public class NoDecisao {

    String pergunta;
    String resultado;

    NoDecisao sim;
    NoDecisao nao;

    public NoDecisao(String pergunta, String resultado) {
        this.pergunta = pergunta;
        this.resultado = resultado;
    }
}