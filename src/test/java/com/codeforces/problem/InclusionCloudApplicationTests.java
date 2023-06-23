package com.codeforces.problem;

import com.codeforces.problem.exceptions.MissingParametersException;
import com.codeforces.problem.services.ModuloService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InclusionCloudApplicationTests {

	@Autowired
	private ModuloService moduloService;

	@Test
	void findMaxValidReturnsMaxModuloCase1() {
		Assertions.assertThrows(MissingParametersException.class, () -> {
			moduloService.findMax(7, null, null);
		});
	}

	@Test
	void findMaxValidReturnsMaxModuloCase2() {
		Assertions.assertEquals(12339, moduloService.findMax(7, 5, 12345).getMax());
	}

	@Test
	void findMaxValidReturnsMaxModuloCase3() {
		Assertions.assertEquals(0, moduloService.findMax(5, 0, 4).getMax());
	}

	@Test
	void findMaxValidReturnsMaxModuloCase4() {
		Assertions.assertEquals(15, moduloService.findMax(10, 5, 15).getMax());
	}

	@Test
	void findMaxValidReturnsMaxModuloCase5() {
		Assertions.assertEquals(54306, moduloService.findMax(17, 8, 54321).getMax());
	}

	@Test
	void findMaxValidReturnsMaxModuloCase6() {
		Assertions.assertEquals(999999995, moduloService.findMax(499999993, 9, 1000000000).getMax());
	}

	@Test
	void findMaxValidReturnsMaxModuloCase7() {
		Assertions.assertEquals(185, moduloService.findMax(10, 5, 187).getMax());
	}

	@Test
	void findMaxValidReturnsMaxModuloCase8() {
		Assertions.assertEquals(999999998, moduloService.findMax(2, 0, 999999999).getMax());
	}

}
