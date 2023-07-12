package br.com.banco.model;


import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataTransferencia;

    private BigDecimal valor;

    private String tipo;

    private String nomeOperadorTransacao;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "conta_id")
    private Conta contaId;

}
