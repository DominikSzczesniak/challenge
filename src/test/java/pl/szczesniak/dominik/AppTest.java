package pl.szczesniak.dominik;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static pl.szczesniak.dominik.App.SearchingChallenge;

class AppTest {

	@Test
	void name() {
//		assertThat(SearchingChallenge("mam na imie dominik")).isEqualTo("mam");
		assertThat(SearchingChallenge("No words")).isEqualTo("-1");
	}
}