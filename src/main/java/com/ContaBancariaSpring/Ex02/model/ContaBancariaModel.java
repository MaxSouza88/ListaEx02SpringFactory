package com.ContaBancariaSpring.Ex02.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contabancaria")
public class ContaBancariaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConta;

    @Column(name = "numero_contas",length = 10, nullable = false)
    private String numConta;

    @Column(name = "numero_agencias",length = 5, nullable = false)
    private String numAgencia;

    @Column(name = "nome_usuario",length = 30, nullable = false)
    private String nomeUsuario;

    @Column(name = "tipo_transacao",length = 20)
    private String tipoTransacao;

    @Column( name = "valor_inicial_conta",length = 10)
    private BigDecimal valorInicial;

    @Column(name = "valor_informado",length = 10)
    private BigDecimal valorTransacao;

    @Column(name = "valor_final_conta",length = 20)
    private BigDecimal valorFinal;



}
