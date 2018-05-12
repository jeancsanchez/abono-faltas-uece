package abono.faltas.domain;

import java.util.Date;

/**
 *
 * @author Jean Carlos <@jeancsanchez at Github> Jesus loves you.
 */
public class Solicitacao {
    
    private Funcionario funcionario;
    private Date inicio;
    private Date termino;
    private String motivo;
    private String observacao;
    private IStatus status;
    
    
    public void solicitar(){
        status.solicitar();
    }
            
    public void aprovar(){
        status.aprovar();
    }
    
    public void recusar(){
        status.recusar();
    }
    
    public void retornar(String mot){
        status.retornar(mot);
    }
}
