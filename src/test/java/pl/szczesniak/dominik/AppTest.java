package pl.szczesniak.dominik;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static pl.szczesniak.dominik.App.ArrayChallenge;

class AppTest {

	@Test
	void name() {
		assertThat(ArrayChallenge(new int[] {5,2,1})).isEqualTo(0);
		assertThat(ArrayChallenge(new int[] {1,20,2,5})).isEqualTo(6);
	}
}