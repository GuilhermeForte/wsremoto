package br.com.projetofinal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="TB_ARTISTA")
public class Artista {
	@Column(name="id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="nomeartistico", length=40)
	private String nomeArtistico;
	@Column(name="nacionalidade", length=30)
	private String nacionalidade;
	@OneToMany(cascade=CascadeType.ALL, mappedBy="artista")
	@JsonIgnoreProperties("artista")
	private List<Musica> musica;
	public Artista() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Artista(int id, String nomeArtistico, String nacionalidade, List<Musica> musica) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
		this.musica = musica;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public List<Musica> getMusica() {
		return musica;
	}
	public void setMusica(List<Musica> musica) {
		this.musica = musica;
	}
	@Override
	public String toString() {
		return "Artista [id=" + id + ", nomeArtistico=" + nomeArtistico + ", nacionalidade=" + nacionalidade
				+ ", musicas=" + musica + "]";
	}
	
	

}
