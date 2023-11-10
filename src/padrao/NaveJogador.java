package padrao;

/*
 *  Professor Gerson Risso
 */
import java.util.List;
import java.util.ArrayList;
public class NaveJogador implements Subject{
    private String nome;
    private Acao acao;
    private List<Observer> lista;

    public NaveJogador(String nome) {
        this.nome = nome;
        lista=new ArrayList<>();
    }
    
    
    @Override
    public void adicionarObservador(Observer observer) {
      lista.add(observer);
    }

    @Override
    public void adicionarAcao(Acao acao) {
        this.acao=acao;
        notificar();
    }

    @Override
    public void notificar() {
        for(Observer obs:lista){
          obs.atualizar(acao);
        }
    }

}
