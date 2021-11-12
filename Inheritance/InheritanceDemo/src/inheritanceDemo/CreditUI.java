package inheritanceDemo;

public class CreditUI {
	/*public void calculateCredit(OgretmenCreditManager ogretmenCreditManager) {
		ogretmenCreditManager.calculate();
	}*/
	
	public void calculateCredit(BaseCreditManager baseCreditManager) {
		baseCreditManager.calculate();
	}
}
