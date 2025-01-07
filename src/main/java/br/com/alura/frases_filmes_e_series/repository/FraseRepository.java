package br.com.alura.frases_filmes_e_series.repository;

import br.com.alura.frases_filmes_e_series.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("select f from Frase f order by function('RANDOM') limit 1")
    Frase buscaFraseAleatoria();
}
