package br.uniesp.si.techback.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Data
@Table(name = "tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "Digite seu nome completo")
    private String nome;
    @CPF
    private String cpf;
    @NotBlank
    @Size(min = 8, max = 20, message = "Digite uma senha entre 8 e 20 caracteres")
    private  String senha;
    @Email(message = "Digite um e-mail valido")
    private String  email;
    @NotBlank
    private String telefone;

}
