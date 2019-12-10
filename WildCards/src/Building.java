/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author I505781
 */
public class Building {
    public int nroQuartos = 17;

    @Override
    public String toString() {
        return ("building");
    }

    public int getNroQuartos() {
        return nroQuartos;
    }

    public void setNroQuartos(int nroQuartos) {
        this.nroQuartos = nroQuartos;
    }

}
