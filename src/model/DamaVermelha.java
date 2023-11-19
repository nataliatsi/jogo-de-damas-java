package model;

import ui.CasaUI;

public class DamaVermelha extends Pedra{
    public DamaVermelha(Casa casa) {
        super(casa);
    }

    @Override
    public void desenhar(CasaUI casaUI) {
        casaUI.desenharDamaVermelha();
    }
    @Override
    public boolean isMovimentoValido(int vezAtual, Casa destino) {
        int distanciaX = Math.abs((destino.getX() - casa.getX()));
        int distanciaY = Math.abs((destino.getY() - casa.getY()));

        return vezAtual == 2 && distanciaX == distanciaY;
    }

}
