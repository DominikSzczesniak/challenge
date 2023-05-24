package pl.szczesniak.dominik;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static pl.szczesniak.dominik.App.SearchingChallenge;

class AppTest {

	@Test
	void name() {
		assertThat(SearchingChallenge("mam na imie dominik")).isEqualTo("a");
		assertThat(SearchingChallenge("No words")).isEqualTo("-1");
		assertThat(SearchingChallenge("Hello apple pie")).isEqualTo("Hllo");
	}
}