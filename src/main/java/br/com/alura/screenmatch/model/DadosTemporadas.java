package br.com.alura.screenmatch.model;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

// Pegamos o numero da temporada e pegamos a listas de episodios da mesma
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosTemporadas(@JsonAlias("Season") Integer numero,
                             @JsonAlias("Episodes") List<DadosEpisodio> episodios) {
}