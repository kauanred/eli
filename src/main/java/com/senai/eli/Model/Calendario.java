package com.senai.eli.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.boot.model.relational.Database;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Table(name = "calendario")
@Entity
@Getter
@Setter
public class Calendario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private LocalDate data;

    @ManyToMany(mappedBy = "calendarios")
    private List<Evento> eventos = new ArrayList<>();
}