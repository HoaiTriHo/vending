import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[] priceProduct = { 2, 3, 4, 5 };
		String[] nameProduct = { "Pepsi", "Coca", "Orange", "Apple" };
		int numberProduct;
		float money, moneyReturn;

		System.out.println("Would you like to drink ?");
		for (int i = 0; i < priceProduct.length; i++) {
			System.out.print(i + 1 + "." + nameProduct[i] + ": " + priceProduct[i] + "$" + "\t");
		}
		System.out.println("\n");
		System.out.print("Select a number: ");
		numberProduct = scanner.nextInt();

		System.out.println("Your choose: " + numberProduct + "." + nameProduct[numberProduct - 1]+" "+priceProduct[numberProduct-1]+"$");
		System.out.print("Enter money please $: ");
		money = scanner.nextFloat();
		
		while(money < priceProduct[numberProduct - 1]){
			System.out.print("Extra money: ");
			money = scanner.nextFloat();
		} 
		
		System.out.println("Enjoy your drink");
		moneyReturn = money - priceProduct[numberProduct - 1];
		int k = 0;
		for (int i = 0; i < priceProduct.length; i++) {
			if (moneyReturn >= priceProduct[i]) {
				k=k+1;
				System.out.print("Want more? Y/N: ");
				String confirm = scanner.next();
				confirm = confirm.toUpperCase();
				if (confirm.equals("Y")) {
					System.out.println("Select drink on keyboard");
					break;
				} else if (confirm.equals("N")) {
					System.out.println("Take your change money: " + moneyReturn);
					break;
				}
			}
		}
		if (k == 0) {
			System.out.println("Take your change money: " + moneyReturn);
		}

	}

}
