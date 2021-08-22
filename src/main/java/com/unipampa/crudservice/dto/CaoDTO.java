package com.unipampa.crudservice.dto;

public class CaoDTO {

    private String nome;
    private String raca;
    private String sexo;

    public CaoDTO() {
    }

    public CaoDTO(String nome, String raca, String sexo) {
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
