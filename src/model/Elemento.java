package model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "Oggetti")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Elemento implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Long codiceISBN;

	@Column(nullable = false)
	protected String titolo;

	@Column(nullable = false)
	protected int annoDiPubblicazione;

	@Column(nullable = false)
	protected int numeroPagine;

	public Long getCodiceISBN() {
		return codiceISBN;
	}

	public void setCodiceISBN(Long codiceISBN) {
		this.codiceISBN = codiceISBN;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnnoDiPubblicazione() {
		return annoDiPubblicazione;
	}

	public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
		this.annoDiPubblicazione = annoDiPubblicazione;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	@Override
	public String toString() {
		return "Elemento [codiceISBN=" + codiceISBN + ", titolo=" + titolo + ", annoDiPubblicazione="
				+ annoDiPubblicazione + ", numeroPagine=" + numeroPagine + "]";
	}
	
	

}
