package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void FinancingConstructorShouldBeCreatedWithoutErrosWhenInputAreCorrect() {
		Assertions.assertDoesNotThrow(() -> {
			Financing financing = new Financing(80000.0, 3000.0, 60);
		});
	}
	
	@Test
	public void FinancingConstructorShouldThrowIllegalArgumentExceptionWhenInputAreNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(80000.0, 1000.0, 60);
		});
	}
	
	@Test
	public void setTotalAmountShouldSetValueWhenInputValid() {
		Double expectedTotalAmount = 90000.0;
		Financing financing = new Financing(80000.0, 3000.0, 60);
		
		financing.setTotalAmount(90000.0);
		
		Assertions.assertEquals(expectedTotalAmount, financing.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInputAreNotValid() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(80000.0, 3000.0, 60);
			financing.setTotalAmount(150000.0);
		});
		

	}

	@Test
	public void setIncomeShouldSetValueWhenInputValid() {
		
	}

}
