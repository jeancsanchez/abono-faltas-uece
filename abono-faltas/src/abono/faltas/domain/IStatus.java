
package abono.faltas.domain;

/**
 *
 * @author Jean Carlos <@jeancsanchez at Github> Jesus loves you.
 */
public interface IStatus {
    
    public void solicitar();
            
    public void aprovar();
    
    public void recusar();
    
    public void retornar(String mot);
}
