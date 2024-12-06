package com.senai.eli.Model;

import com.senai.eli.Enum.Sexo;
import com.senai.eli.Validator.Telefone.Telefone;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    @ColumnDefault("3")
    private Sexo sexo = Sexo.NAO_INFORMADO;

    @Column(name = "email")
    @Email
    private String email;

    @Column(name = "telefone", length = 15)
    @Telefone (apenasCelular = true, required = false)
    private String telefone;

    @Column(name = "nascimento", nullable = false)
    private LocalDate nascimento;
}
