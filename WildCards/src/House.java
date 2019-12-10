/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author I505781
 */
class House extends Building {
    public int nroQuartos = 10;

    @Override
    public String toString() {
        return ("house");
    }
    
    public int getNroQuartos(){
        return nroQuartos;
    }

    public void setNroQuartos(int nroQuartos) {
        this.nroQuartos = nroQuartos;
    }
    
    
    
}
