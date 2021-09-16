package com.X_workz.methods;

public class TollGate {
	public static void gateOpen() {
		System.out.println("toll gate opens");
	}

	public static void gateClose() {
		System.out.println("toll gate close");
	}

	public static void payment() {
		System.out.println("paid sucessfully");
	}

	public static void main(String[] args) {

		System.out.println("begining of method");
		TollGate.gateOpen();
		TollGate.gateClose();
		TollGate.payment();
		System.out.println("end of method");

	}

}
