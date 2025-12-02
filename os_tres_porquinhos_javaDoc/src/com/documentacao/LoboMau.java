package com.documentacao;

/**
 * Representa o antagonista.
 * @author Amanda Salvador
 * @version 1.0.0
 * @since 2025-11-25
 * */
public class LoboMau {
    private int forcaDoSopro = 10;
    /**
     * @param casaAlvo Descreve a casa alvo.
     * @see Casa#resisteAoSopro(int)
     * */
    public void soprar(Casa casaAlvo){
        casaAlvo.resisteAoSopro(forcaDoSopro);
    }

    /**
     * @return Descreve o valor inteiro da força do lobo.
     * */
    public int getForcaDoSopro(){
        return forcaDoSopro;
    }
}
