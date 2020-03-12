package br.com.rd.exerciciospring.model.Entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdProduto;
    @Column(name = "id_produto")
    private String idProduto;

    @Column(name = "ds_produto")
    private String dsProduto;


}
