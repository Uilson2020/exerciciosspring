package br.com.rd.exerciciospring.repository;

import br.com.rd.exerciciospring.model.Entities.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {
    public List<Cupom> findByIdCupom(Long idCupom);

    Cupom salvar(Cupom cupom);
}
