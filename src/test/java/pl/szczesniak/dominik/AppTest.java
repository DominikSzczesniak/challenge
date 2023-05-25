package pl.szczesniak.dominik;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static pl.szczesniak.dominik.App.ArrayChallenge;
import static pl.szczesniak.dominik.App.MatrixChallenge;
import static pl.szczesniak.dominik.App.SearchingChallenge;

class AppTest {


	@Test
	void searching() {
		assertThat(SearchingChallenge("mam na imie dominik")).isEqualTo("a");
		assertThat(SearchingChallenge("No words")).isEqualTo("-1");
		assertThat(SearchingChallenge("Hello apple pie")).isEqualTo("Hllo");
	}

	@Test
	void array() {
		assertThat(ArrayChallenge(new int[] {5,2,1})).isEqualTo(0);
		assertThat(ArrayChallenge(new int[] {1,20,2,5})).isEqualTo(6);
	}

	@Test
	void matrix() {
		assertThat(MatrixChallenge(new String[] {"1011", "0011", "0111", "1111"})).isEqualTo("8");
		assertThat(MatrixChallenge(new String[] {"101", "111", "001"})).isEqualTo("3");
	}
}