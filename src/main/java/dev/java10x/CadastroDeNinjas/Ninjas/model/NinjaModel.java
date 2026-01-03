package dev.java10x.CadastroDeNinjas.Ninjas.model;

import dev.java10x.CadastroDeNinjas.Missoes.model.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idNinja")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "senha")
    private int senha;

    @ManyToOne
    @JoinColumn(name = "idMissoes") // FK
    private MissoesModel missoes;

}
