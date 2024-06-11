package br.com.dio.desafio.domain.entities;

import br.com.dio.desafio.infra.services.CourseDefault;

import java.time.LocalDate;

public class Mentoria extends Conteudo implements CourseDefault {

    private LocalDate data;

    @Override
    public double calcXp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
