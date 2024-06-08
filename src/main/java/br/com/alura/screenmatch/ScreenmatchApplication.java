package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporadas;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=e631682f");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados( json, DadosSerie.class);
		System.out.println(dados);
		json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=1&episode=4&apikey=e631682f");
		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		System.out.println(dadosEpisodio);

		List<DadosTemporadas> temporadas = new ArrayList<>();
	// for criado para contar o numero total de temporadas da serie escolida
		for(int i = 1; i<= dados.totalTemporadas(); i++) {
			// json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&episode=4&apikey=e631682f");
			json = consumoApi.obterDados ("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=e631682f");
			DadosTemporadas dadosTemporada = conversor.obterDados(json, DadosTemporadas.class);

			temporadas.add(dadosTemporada);
		}
		temporadas.forEach(System.out::println);
	}
}