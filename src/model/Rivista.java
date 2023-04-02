package model;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "Riviste")
public class Rivista extends Elemento {

	@Enumerated(EnumType.STRING)
	private TipoPeriodicita tipoPeriodicita;

	public TipoPeriodicita getTipoPeriodicita() {
		return tipoPeriodicita;
	}

	public void setTipoPeriodicita(TipoPeriodicita tipoPeriodicita) {
		this.tipoPeriodicita = tipoPeriodicita;
	}

	@Override
	public String toString() {
		String generale = "\n Rivista:";
		generale += "\n Titolo: " + titolo;
		generale += "\n Anno: " + annoDiPubblicazione;
		generale += "\n Pagine: " + numeroPagine;
		generale += "\n Periodicita: " + tipoPeriodicita;
		generale += "\n";
		return generale;
	}

}
