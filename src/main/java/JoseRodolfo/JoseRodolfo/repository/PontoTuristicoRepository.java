package JoseRodolfo.JoseRodolfo.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JoseRodolfo.JoseRodolfo.model.PontoTuristico;


@Repository
public interface PontoTuristicoRepository extends JpaRepository<PontoTuristicoRepository, String> {

    Optional<PontoTuristico> findAll(String nome);

    void save(PontoTuristico pontoTuristico);

    void delete(PontoTuristico cust);
    
}

