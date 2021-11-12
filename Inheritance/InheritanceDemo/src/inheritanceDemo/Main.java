package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		/*OgretmenCreditManager ogretmenCreditManager = new OgretmenCreditManager();
		ogretmenCreditManager.calculate();*/
		
		CreditUI creditUI = new CreditUI();
		creditUI.calculateCredit(new OgretmenCreditManager());
		creditUI.calculateCredit(new TarimCreditManager());

	}

}
