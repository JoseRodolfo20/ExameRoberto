package JoseRodolfo.JoseRodolfo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "PontoTuristico")
public class PontoTuristico {

    @org.springframework.data.annotation.Id
	private String nome;
    private String cidade;
    private Number longitude;
    private Number latitude;
    private Number dataInauguracao;

    public PontoTuristico() {
    }

	public PontoTuristico(String nome, String cidade, Number latitude, Number longitude, Number dataInauguracao) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.latitude = latitude;
		this.longitude = longitude;
	}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public Number getLatitude() {
        return latitude;
    }
    public void setLatitude(Number latitude) {
        this.latitude = latitude;
    }
    public Number getLongitude() {
        return longitude;
    }
    public void setLongitude(Number longitude) {
        this.longitude = longitude;
    }
    public Number getDataInauguracao() {
        return dataInauguracao;
    }
    public void setDataInauguracao(Number dataInauguracao) {
        this.dataInauguracao = dataInauguracao;
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PontoTuristico other = (PontoTuristico) obj;
		if (nome != other.nome)
			return false;
		return true;
	}

    public void setPontoTuristico(Object pontoTuristico) {
    }
    
}
