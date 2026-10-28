package arvoredecisao;

public class ConstrutorArvore {

    public static NoDecisao construir() {

        // Resultados
        NoDecisao oraPois =
                new NoDecisao(null, "Você eh mano Feliz!");

        NoDecisao maraisaMaiara =
                new NoDecisao(null, "Você eh Maiara!!");

        NoDecisao limaGilbala =
                new NoDecisao(null, "Você eh Gilberto de Lima!");

        NoDecisao stuwartAndre =
                new NoDecisao(null, "Você eh André Stuwart!!");

        NoDecisao severinoGomes =
                new NoDecisao(null, "Você eh Nosso querido professor maravilhoso Severino Paulo Gommes Neto!");

        NoDecisao leoLeo =
                new NoDecisao(null, "Você eh Leonardo!!");

        NoDecisao carlinho =
                new NoDecisao(null, "Você eh Carlos!");

        NoDecisao tobiasTiago =
                new NoDecisao(null, "Você eh Tiago Tobias!!");

        //PERGUNTAS

        //Terceiro nivel - esquerdo
        NoDecisao usarPalmatoria =
                new NoDecisao("Voce usaria palmatoria em suas aulas?", null);

        usarPalmatoria.sim = severinoGomes;
        usarPalmatoria.nao = leoLeo;

        NoDecisao bolaoVirtual =
                new NoDecisao("Voce eh dono de bolao virtual?", null);

        bolaoVirtual.sim = carlinho;
        bolaoVirtual.nao = tobiasTiago;

        //Terceiro nivel - direito
        NoDecisao correrMaratona =
                new NoDecisao("Voce ja correu uma maratona?", null);

        correrMaratona.sim = stuwartAndre;
        correrMaratona.nao = limaGilbala;

        NoDecisao conjugeEsquisito =
                new NoDecisao("O seu conjuge bate bem da cabeça?", null);

        conjugeEsquisito.sim = maraisaMaiara;
        conjugeEsquisito.nao = oraPois;

        //Segundo nivel
        NoDecisao gostarAlunos =
                new NoDecisao("Você gosta dos seus alunos?", null);

        gostarAlunos.sim = usarPalmatoria;
        gostarAlunos.nao = bolaoVirtual;

        NoDecisao surtarAula =
                new NoDecisao("Você já surtou em aula?", null);

        surtarAula.sim = correrMaratona;
        surtarAula.nao = conjugeEsquisito;

        // Primeiro nivel
        NoDecisao raiz =
                new NoDecisao("Você dá aula no técnico?", null);

        raiz.sim = gostarAlunos;
        raiz.nao = surtarAula;

        return raiz;
    }
}