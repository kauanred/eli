package com.senai.eli.Enum;

public enum Sexo {
    MASCULINO(1,'M', "Masculino"),
    FEMININO(2, 'F', "Femino"),
    NAO_INFORMADO(3, 'N', "Não Informado");

    private final int codigo;
    private final char abreviacao;
    private final String drescricao;

    Sexo(int codigo, char abreviacao, String descricao){
        this.codigo = codigo;
        this.abreviacao = abreviacao;
        this.drescricao = descricao;
    }
}
