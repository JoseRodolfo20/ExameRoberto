package JoseRodolfo.JoseRodolfo.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import JoseRodolfo.JoseRodolfo.model.PontoTuristico;

public class PontoTuristicoDTO {

    @NotNull(message = "Nome can not be null.")
	@NotEmpty(message = "Nome can not be empty.")
    private String nome;
    
    @NotNull(message = "Cidade can not be null.")
	@NotEmpty(message = "Cidade can not be empty.")
    private String cidade;

    @NotNull(message = "Latitude can not be null.")
    @NotEmpty(message = "Latitude can not be empty.")
    private Number latitude;

    @NotNull(message = "Longitude can not be null.")
    @NotEmpty(message = "Longitude can not be empty.")
    private Number longitude;

    @NotNull(message = "Data de Inauguração can not be null.")
	@NotEmpty(message = "Data de Inauguração can not be empty.")
    private Number dataInauguracao;

    public PontoTuristicoDTO() {
	}
    public PontoTuristicoDTO(PontoTuristico pontoTuristico) {
        this.nome = pontoTuristico.getNome();
        this.cidade = pontoTuristico.getCidade();
        this.latitude = pontoTuristico.getLatitude();
        this.longitude = pontoTuristico.getLongitude();
        this.dataInauguracao = pontoTuristico.getDataInauguracao();
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
    public Object getPontoTuristico() {
        return null;
    }
    
}
