package abono.faltas;

import abono.faltas.domain.IStatus;

/**
 *
 * @author Jean Carlos <@jeancsanchez at Github> Jesus loves you.
 */
public class Aprovada implements IStatus {

    @Override
    public void solicitar() {
        throw new UnsupportedOperationException("Notsupportedyet.");
    }

    @Override
    public void aprovar() {
        throw new UnsupportedOperationException("Notsupportedyet.");
    }

    @Override
    public void recusar() {
        throw new UnsupportedOperationException("Notsupportedyet.");
    }

    @Override
    public void retornar(String mot) {
        throw new UnsupportedOperationException("Notsupportedyet.");
    }
   
}
