 

package padrao;

 
/*
 *  Professor Gerson Risso
 *
 */
public interface Subject {
  public void adicionarObservador(Observer observer);
  public void adicionarAcao(Acao acao);
  public void notificar();
}
