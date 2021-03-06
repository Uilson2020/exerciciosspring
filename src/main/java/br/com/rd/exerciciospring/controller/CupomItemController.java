package br.com.rd.exerciciospring.controller;
import br.com.rd.exerciciospring.model.Entities.Cupom;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CupomItemController {

    @Autowired
    private CupomItemRepository respository;

    @PostMapping("/cupom_item")
    public Cupom salvar(@RequestBody Cupom cupom){
        return  respository.salvar(cupom);
    }
}
