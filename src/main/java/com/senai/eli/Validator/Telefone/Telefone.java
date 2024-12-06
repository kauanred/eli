package com.senai.eli.Validator.Telefone;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = TelefoneValidator.class)
@Target ({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Telefone {

//mensagem padrao da validacao do telefone
String message() default "Telefone invalido";
  
//permite agrupar validacao
Class<?>[]groups()default{};


//permite ter mais informacoes de erro
Class<? extends Payload> [] payload() default{};

//parametro com objeto de definir se pode telefone fixo ou celular
boolean apenasCelular() default false;

//parametro com objetivo de definir se é obrigatorio o preenchimento
boolean required() default false;

}
