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
@Table(name="tb_cupom_item")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCupomItem;

    @Column(name = "qt_produto")
    private Long qtProduto;

    @Column(name = "vl_produto")
    private BigDecimal vlProduto;
}
