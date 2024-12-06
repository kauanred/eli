package com.senai.eli.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "local")
@Entity
@Getter
@Setter
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "latidude")
    private String latidude;

    @Column(name = "longitude")
    private String longitude;

    @Column(name = "logradouro", nullable = false)
    private String logradouro;

    @Column(name = "numero")
    private int numero;

    @Column(name = "cep", nullable = false, length = 9)
    @Pattern(regexp = "\\d{5}-\\d{3}")
    private String cep;


    @ManyToMany(mappedBy = "grupo_trabalho")
    private List<Evento> eventos = new ArrayList<>();
}