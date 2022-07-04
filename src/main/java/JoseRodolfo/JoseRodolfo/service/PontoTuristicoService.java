package JoseRodolfo.JoseRodolfo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import JoseRodolfo.JoseRodolfo.controller.exception.InvalidDataException;
import JoseRodolfo.JoseRodolfo.controller.exception.ObjectNotFoundException;
import JoseRodolfo.JoseRodolfo.dto.PontoTuristicoDTO;
import JoseRodolfo.JoseRodolfo.model.PontoTuristico;
import JoseRodolfo.JoseRodolfo.repository.PontoTuristicoRepository;

@Service
public class PontoTuristicoService {

    private static final PontoTuristicoRepository Repo = null;
    @Autowired
	private PontoTuristicoRepository repo;

	public List<PontoTuristicoRepository> findAll() {
		return repo.findAll();
	}

    public PontoTuristico findAll(String nome) {
		Optional<PontoTuristico> obj = repo.findAll(nome);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Ponto Turistico " + nome + " not found."));
	}

    public String createPontoTuristico(PontoTuristico PontoTuristico) {
		Optional<PontoTuristico> existingPontoTuristico = repo.findAll(PontoTuristico.getNome());
		if (existingPontoTuristico.isPresent()) {
			throw new InvalidDataException("PontoTuristico already exist with this id: " + PontoTuristico.getNome());
		}
		repo.save(PontoTuristico);
		return PontoTuristico.getNome();
	}

    public PontoTuristico toPontoTuristico(PontoTuristicoDTO PontoTuristico) {
		return new PontoTuristico(PontoTuristico.getNome(), null, null, null, null);
	}

    public void updatePontoTuristico(PontoTuristico PontoTuristico, String nome) {
		if (PontoTuristico == null) {
			throw new InvalidDataException("Invalid PontoTuristico id.");
		}
		PontoTuristico existingObj = findAll(nome);
		updateData(existingObj, PontoTuristico);
		repo.save(PontoTuristico);
	}

	public void updateData(@Valid PontoTuristico existingObj, PontoTuristico pontoTuristico) {
		existingObj.setNome(pontoTuristico.getNome());
	}

    public void deletePontoTuristico(String nome) {
		if (Objects.isNull(nome)) {
			throw new InvalidDataException("Category id can not be null.");
		}
		PontoTuristico cust = findAll(nome);
		try {
			repo.delete(cust);
		} catch (DataIntegrityViolationException e) {
			throw new InvalidDataException("Can not delete a PontoTuristico");
		}
	}

    public void updateData(@Valid PontoTuristicoDTO dto, String nome) {
    }
	
    
}
