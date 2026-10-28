package arvoredecisao;

public class NoDecisao {

    private String pergunta;
    private String resultado;

    private NoDecisao sim;
    private NoDecisao nao;

    public String getPergunta() {
        return pergunta;
    }

    public String getResultado() {
        return resultado;
    }

    public NoDecisao getSim() {
        return sim;
    }

    public void setSim(NoDecisao sim) {
        this.sim = sim;
    }

    public NoDecisao getNao() {
        return nao;
    }

    public void setNao(NoDecisao nao) {
        this.nao = nao;
    }

    public NoDecisao(String pergunta, String resultado) {
        this.pergunta = pergunta;
        this.resultado = resultado;
    }
}