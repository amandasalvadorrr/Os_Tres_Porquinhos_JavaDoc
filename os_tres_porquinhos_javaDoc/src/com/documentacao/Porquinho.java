package com.documentacao;

/**
 * Representa um dos três porquinhos da história.
 * @author Amanda Salvador
 * @version 1.0.0
 * @since 2025-11-25
 */
public class Porquinho {
    private String nome;

    public Porquinho(String nome) {
        this.nome = nome;
    }

    /**
     * @param tipoCasa Descreve a casa sendo construída.
     * @link CasaDeTijolos
     */
    public void construir(Casa tipoCasa) {
    }

    /**
     * @param porquinhoAlvo Descreve o porquinho para o qual está fugindo.
     * @deprecated Sugere-se que o porquinho utilize a casa do irmão.
     */
    @Deprecated
    public void fugir(Porquinho porquinhoAlvo) {
    }

    /**
     * @return Descreve o nome do porquinho: Cícero, Epa ou Prático.
     */
    public String getNome() {
        return nome;
    }
}
