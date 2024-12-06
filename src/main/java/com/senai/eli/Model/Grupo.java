package com.senai.eli.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "grupo")
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome do Grupo", nullable = false)
    private String grupoNome;

    @Column(name = "Responsavel")
    private String responsavel;

    @Column(name = "Descricao:")
    private String Descricao;

    @ManyToMany(mappedBy = "grupo")
    private List<Evento> eventos = new ArrayList<>();
}