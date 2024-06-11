package br.com.dio.desafio.domain.entities;

import br.com.dio.desafio.infra.services.CourseDefault;

public abstract class Conteudo implements CourseDefault {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public Double calcularXp() {
        return null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
