package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Libri")

public class Libro extends Elemento {

	@Column(nullable = false)
	public String autore;

	@Column(nullable = false)
	public String genere;

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
		String generale = "\n Libro:";
		generale += "\n Titolo: " + titolo;
		generale += "\n Autore: " + autore;
		generale += "\n Genere: " + genere;
		generale += "\n Anno: " + annoDiPubblicazione;
		generale += "\n Pagine: " + numeroPagine;
		generale += "\n";
		return generale;
	}

}
