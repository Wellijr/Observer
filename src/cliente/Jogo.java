package cliente;


/*
*  Professor Gerson Risso
 */
import padrao.*;

public class Jogo {

    public static void main(String[] args) {
        Subject naveJ = new NaveJogador("Gerson");
        Observer naveI1 = new NaveInimiga("Inimiga 1", naveJ);
        naveJ.adicionarAcao(Acao.AVANCAR);
        naveJ.adicionarAcao(Acao.RECUAR);
        naveJ.adicionarAcao(Acao.VIRAR_DIR);
        Observer naveI2 = new NaveInimiga("Inimiga 2", naveJ);
        naveJ.adicionarAcao(Acao.RECUAR);
        naveJ.adicionarAcao(Acao.VIRAR_ESQ);
    }

}
