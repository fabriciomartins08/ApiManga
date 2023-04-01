package Manga.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MangaVendas 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private int ranking;
	
	@Column(nullable = false)
	private int number_of_volumes_made;
	
	@Column(nullable = false)
	private int number_of_copies_sold_in_millions;
	
	@Column(nullable = false)
	private int year;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String author;
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public int getNumber_of_volumes_made() {
		return number_of_volumes_made;
	}

	public void setNumber_of_volumes_made(int number_of_volumes_made) {
		this.number_of_volumes_made = number_of_volumes_made;
	}

	public int getNumber_of_copies_sold_in_millions() {
		return number_of_copies_sold_in_millions;
	}

	public void setNumber_of_copies_sold_in_millions(int number_of_copies_sold_in_millions) {
		this.number_of_copies_sold_in_millions = number_of_copies_sold_in_millions;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MangaVendas other = (MangaVendas) obj;
		return Objects.equals(id, other.id);
	}
	
}
