package pl.szczesniak.dominik;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static pl.szczesniak.dominik.App.MatrixChallenge;

class AppTest {

	@Test
	void name() {
		assertThat(MatrixChallenge(new String[] {"1011", "0011", "0111", "1111"})).isEqualTo("8");
		assertThat(MatrixChallenge(new String[] {"101", "111", "001"})).isEqualTo("3");
	}
}