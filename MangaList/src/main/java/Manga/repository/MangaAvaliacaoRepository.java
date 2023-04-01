package Manga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Manga.model.MangaAvaliacao;

@Repository
public interface MangaAvaliacaoRepository extends JpaRepository<MangaAvaliacao,Long>{

}
