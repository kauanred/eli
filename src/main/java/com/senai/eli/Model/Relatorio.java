package com.senai.eli.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "relatorio")
@Entity
@Getter
@Setter
public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "inovacao", nullable = false)
    private String inovacao;

    @ManyToMany(mappedBy = "relatorio")
    private List<Evento> eventos = new ArrayList<>();

}