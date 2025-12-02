package com.documentacao;

/**
 * Representa o conceito geral de uma casa.
 * @author Amanda Salvador
 * @version 1.0.0
 * @since 2025-11-25
 * */
public class Casa {
    private String material;
    private int forcaDoSopro;
    private String statusAtual;

    public Casa(String material, int forcaDoSopro, String statusAtual) {
        this.material = material;
        this.forcaDoSopro = forcaDoSopro;
        this.statusAtual = statusAtual;
    }

    /**
     * @return Descreve o material: (Palha, Madeira, Tijolo).
     * */
    public String getMaterial(){
        return material;
    }

    /**
     * @param forcaDoSopro Descreve o parametro.
     * @return Descreve se a casa resistiu ou não ao sopro - true ou false.
     * */
    public boolean resisteAoSopro(int forcaDoSopro){
        return true;
    }

    /**
     * @return Descreve se a casa está De Pé ou Destruído.
     * */
    public String getStatusAtual() {
        return statusAtual;
    }
}
