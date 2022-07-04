package JoseRodolfo.JoseRodolfo.controller;

import java.net.URI;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import JoseRodolfo.JoseRodolfo.dto.PontoTuristicoDTO;
import JoseRodolfo.JoseRodolfo.model.PontoTuristico;
import JoseRodolfo.JoseRodolfo.service.PontoTuristicoService;

@RestController
@RequestMapping("/pontoTuristico")
@Controller
public class PontoTuristicoController {

    @Autowired
	private PontoTuristicoService service;

	@GetMapping("")
	public ResponseEntity<List<PontoTuristicoDTO>> findAll() {
		List<PontoTuristicoDTO> list = service.findAll().stream().map(c -> new PontoTuristicoDTO()).collect(Collectors.toList());
		return ResponseEntity.ok().body(list);
	}

    @GetMapping("/{nome}")
	public PontoTuristicoDTO findAll(@PathVariable String nome) {
		PontoTuristico msg = service.findAll(nome);
		return new PontoTuristicoDTO(msg);
	}

    @PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public void createPontoTuristico(@RequestBody @Valid PontoTuristicoDTO nome) {
		service.toPontoTuristico(nome);
	}

	@PutMapping("/{nome}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateData(@RequestBody @Valid PontoTuristicoDTO dto , @PathVariable String nome) {
		service.updateData(dto, nome);
	}
	
	//implementar o DELETE
	@DeleteMapping("/{nome}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletePontoTuristico(@PathVariable String nome) {
		service.deletePontoTuristico(nome);
	}
    
}
