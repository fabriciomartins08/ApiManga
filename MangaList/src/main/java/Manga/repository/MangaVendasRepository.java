package Manga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Manga.model.MangaVendas;

@Repository
public interface MangaVendasRepository extends JpaRepository<MangaVendas,Long>{

}
