package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import model.*;

public class Main {

	private static Department[] departments;
	private static Scanner reader;

	public Main() {
		reader = new Scanner(System.in);

	}

	public static void main(String[] args) {
		Main m = new Main();

		int size = Integer.parseInt(reader.nextLine());
		departments = new Department[size];
		for (int i = 0; i < size; i++) {
			String a = reader.nextLine();
			String[] b = a.split(";");
			String name = b[0];
			int goldenMasculine = Integer.parseInt(b[1]);
			int silverMasculine = Integer.parseInt(b[2]);
			int bronzeMasculine = Integer.parseInt(b[3]);
			int goldenFemenine = Integer.parseInt(b[4]);
			int silverFemenine = Integer.parseInt(b[5]);
			int bronzeFemenine = Integer.parseInt(b[6]);
			int goldenMixed = Integer.parseInt(b[7]);
			int silverMixed = Integer.parseInt(b[8]);
			int bronzeMixed = Integer.parseInt(b[9]);
			departments[i] = new Department(name, goldenMasculine, silverMasculine, bronzeMasculine, goldenFemenine,
					silverFemenine, bronzeFemenine, goldenMixed, silverMixed, bronzeMixed);

		}
		for (int i = 1; i < size; i++) {
			for (int i2 = i; (i2 > 0) && (departments[i2].compare(departments[i2 - 1], departments[i2])) < 0; i2--) {
				Department temp = departments[i2];
				departments[i2] = departments[i2 - 1];
				departments[i2 - 1] = temp;

			}
		}
		for (int i = 0; i < departments.length; i++) {
			System.out.println(departments[i].toString2());
		}

		System.out.println("----------");

		for (int i = 1; i < size; i++) {
			for (int i2 = i; (i2 > 0) && (departments[i2].compare(departments[i2 - 1], departments[i2])) > 0; i2--) {
				Department temp = departments[i2];
				departments[i2] = departments[i2 - 1];
				departments[i2 - 1] = temp;

			}
		}
		for (int i = 0; i < departments.length; i++) {
			System.out.println(departments[i].toString2());
		}
		System.out.println("----------");

		for (int i = 1; i < size; i++) {
			for (int i2 = i; (i2 > 0) && (departments[i2].compareTo(departments[i2 - 1])) < 0; i2--) {
				Department temp = departments[i2];
				departments[i2] = departments[i2 - 1];
				departments[i2 - 1] = temp;

			}
		}
		for (int i = 0; i < departments.length; i++) {
			System.out.println(departments[i]);
		}

	}

}
