package com.SystemRH.SystemRH.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.SystemRH.SystemRH.models.Cadidato;
import com.SystemRH.SystemRH.models.Vaga;

public interface CandidatoRopository extends CrudRepository<Cadidato, String>{
	Iterable<Cadidato>findByVaga(Vaga vaga);
}
