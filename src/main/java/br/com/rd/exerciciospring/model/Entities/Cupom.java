package br.com.rd.exerciciospring.model.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_cupom")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCupom;


    @OneToMany
    @JoinColumn(name = "id_Cliente")
    private Long cupomItem ;

    @Column(name = "dt_venda")
    private String dtVenda;

    @Column(name = "vl_venda")
    private BigDecimal vlvenda;
}
