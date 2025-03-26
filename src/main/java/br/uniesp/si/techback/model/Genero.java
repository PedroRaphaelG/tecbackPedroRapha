package br.uniesp.si.techback.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "tb_genero")
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;
}
