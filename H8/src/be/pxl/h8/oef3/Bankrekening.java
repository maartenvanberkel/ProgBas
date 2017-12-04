package be.pxl.h8.oef3;

import java.util.Scanner;

public class Bankrekening {
	private String rekeningnummer;
	private String naam;
	private double saldo;
	private double rentepercentage;

	public Bankrekening() {
		this("geen", "onbekend", 0, 1.2);
	}

	public Bankrekening(String rekeningnummer, String naam, double saldo, double rentepercentage) {
		setRekeningnummer(rekeningnummer);
		setNaam(naam);
		setSaldo(saldo);
		setRentepercentage(rentepercentage);
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;

		if (saldo < 0) {
			this.saldo = 0;
		}
	}

	public void setRentepercentage(double rentepercentage) {
		this.rentepercentage = rentepercentage;

		if (rentepercentage < 0) {
			this.rentepercentage = 0;
		}
	}

	public void setRekeningnummer(String rekeningnummer) {
		this.rekeningnummer = rekeningnummer;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public void stort(double deposit) {
		if (controleerRekeningnummer()) {
			this.saldo += deposit;
			System.out.println("Na storting van " + deposit + " euro.");
			print();
		}
	}

	public void neemOp(double withdrawal) {
		if (controleerRekeningnummer()) {
			if (this.saldo == 0) {
				System.out.println("U kan geen geld opnemen omdat uw saldo 0 euro bedraagt.");
			} else {
				if (withdrawal > this.saldo) {
					System.out.printf(
							"Het saldo is %.2f euro en u wil %.2f euro opnemen. U mag enkel %.2f euro opnemen.\n",
							this.saldo, withdrawal, this.saldo);
					this.saldo = 0;
				} else {
					this.saldo -= withdrawal;
					System.out.println("Na opname van " + withdrawal + " euro.");
					print();
				}
			}
		}
	}

	public void verrichting(double... verrichtingen) {
		if (controleerRekeningnummer()) {
			for (int i = 0; i < verrichtingen.length; i++) {
				if (verrichtingen[i] < 0) {
					neemOp(-verrichtingen[i]);
				} else {
					stort(verrichtingen[i]);
				}
			}
		}
	}

	public void schrijfRenteBij() {
		if (controleerRekeningnummer()) {
			this.saldo += this.saldo * rentepercentage / 100;
			System.out.println("Rente wordt begeschreven voor " + this.saldo * rentepercentage / 100 + " euro.");
			print();
		}
	}

	public boolean controleerRekeningnummer() {
		Scanner keyboard = new Scanner(System.in);

		if (rekeningnummer.equals("geen")) {
			System.out.println("Sorry, geen rekeningnummer.");
			return false;
		} else {
			if (naam.equals("onbekend")) {
				System.out.println("Voer uw naam in: ");
				setNaam(keyboard.nextLine());
			}
			return true;
		}
	}

	public void print() {
		System.out.println("Saldo op spaarrekening " + this.rekeningnummer + " op naam van " + this.naam + " bedraagt "
				+ this.saldo + " euro.");
	}

	public double getSaldo() {
		return saldo;
	}
}
