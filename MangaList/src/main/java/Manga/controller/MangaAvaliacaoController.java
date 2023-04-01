package Manga.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Manga.model.MangaAvaliacao;
import Manga.repository.MangaAvaliacaoRepository;

@RestController
@RequestMapping("/mangaAvaliacao")
public class MangaAvaliacaoController {
	
	@Autowired
	private MangaAvaliacaoRepository MangaAvaliacaoRepository;
	
	@GetMapping
	public List<MangaAvaliacao> mangaAvaliacao(){
		return MangaAvaliacaoRepository.findAll();
			
	}
	
	@GetMapping(value = "/{id}")
	public Optional<MangaAvaliacao> findById(@PathVariable Long id) {
	return MangaAvaliacaoRepository.findById(id);
	}
	
	@PostMapping(value ="/adicionar")
	@ResponseStatus(HttpStatus.CREATED)
	public MangaAvaliacao adicionar(@RequestBody MangaAvaliacao mangaAvaliacao) {
		return MangaAvaliacaoRepository.save(mangaAvaliacao);
	}
	
	@PostMapping(value ="/remover")
	public void remover(@RequestBody MangaAvaliacao mangaAvaliacao) {
		MangaAvaliacaoRepository.delete(mangaAvaliacao);
	}
	
	@PostMapping(value ="/alterar")
	public MangaAvaliacao alterar(@RequestBody MangaAvaliacao mangaAvaliacao) {
		return MangaAvaliacaoRepository.saveAndFlush(mangaAvaliacao);
	}
	
	}

