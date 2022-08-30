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
		Double expectedIncome = 4000.0;
		Financing financing = new Financing(80000.0, 3000.0, 60);

		financing.setIncome(expectedIncome);

		Assertions.assertEquals(expectedIncome, financing.getIncome());
	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInputAreNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(80000.0, 3000.0, 60);

			f.setIncome(1000.0);
		});
	}

	@Test
	public void setMonthsShouldSetValueWhenInputIsValid() {
		Integer expectedMonthsValue = 120;
		Financing f = new Financing(80000.0, 3000.0, 60);

		f.setMonths(expectedMonthsValue);

		Assertions.assertEquals(expectedMonthsValue, f.getMonths());
	}

	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInputIsNotValid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(80000.0, 3000.0, 60);

			f.setMonths(30);
		});
	}

	@Test
	public void entryShouldCalculate20PercentOfTotalAmountFinanced() {
		Double expectedEntryAmount = 16000.0;
		Financing f = new Financing(80000.0, 3000.0, 60);

		Double calculatedEntryAmount = f.entry();

		Assertions.assertEquals(expectedEntryAmount, calculatedEntryAmount);
	}

	@Test
	public void quotaShouldCalculateCorrectlyAccordingBussinesRule() {
		Double expectedQuotaAmount = 1000.0;
		Financing f = new Financing(200000.0, 4000.0, 160);

		Double calculatedQuota = f.quota();

		Assertions.assertEquals(expectedQuotaAmount, calculatedQuota);
	}

}
