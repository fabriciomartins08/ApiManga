package Manga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Manga.model.MangaVendas;
import Manga.repository.MangaVendasRepository;

@RestController
@RequestMapping("/manga")
public class MangaVendasController {
	
	@Autowired
	private MangaVendasRepository MangaVendasRepository;
	
	@GetMapping
	public List<MangaVendas> mangaVendas(){
		return MangaVendasRepository.findAll();
			
	}
	
	@PostMapping(value ="/adicionar")
	@ResponseStatus(HttpStatus.CREATED)
	public MangaVendas adicionar(@RequestBody MangaVendas mangaVendas) {
		return MangaVendasRepository.save(mangaVendas);
	}
	
	@PostMapping(value ="/remover")
	public void remover(@RequestBody MangaVendas mangaVendas) {
		MangaVendasRepository.delete(mangaVendas);
	}
	
	@PostMapping(value ="/alterar")
	public MangaVendas alterar(@RequestBody MangaVendas mangaVendas) {
		return MangaVendasRepository.saveAndFlush(mangaVendas);
	}
	
	}

