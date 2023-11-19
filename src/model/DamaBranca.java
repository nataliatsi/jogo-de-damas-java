package model;

import ui.CasaUI;

public class DamaBranca extends Pedra{
    public DamaBranca(Casa casa) {
        super(casa);
    }

    @Override
    public void desenhar(CasaUI casaUI) {
        casaUI.desenharDamaBranca();
    }
    @Override
    public boolean isMovimentoValido(int vezAtual, Casa destino) {
        int distanciaX = Math.abs((destino.getX() - casa.getX()));
        int distanciaY = Math.abs((destino.getY() - casa.getY()));

        return vezAtual == 1 && distanciaX == distanciaY;
    }

}
