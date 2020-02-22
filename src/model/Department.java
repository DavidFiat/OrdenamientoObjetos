package model;

import java.util.Comparator;

public class Department implements Comparable<Department>, Comparator<Department> {
	private String name;
	private int goldenMasculine;
	private int silverMasculine;
	private int bronzeMasculine;
	private int goldenFemenine;
	private int silverFemenine;
	private int bronzeFemenine;
	private int goldenMixed;
	private int silverMixed;
	private int bronzeMixed;

	@Override
	public String toString() {
		return name + " " + totalGolden() + " " + totalSilver() + " " + totalBronze() + " " + total();
	}

	public Department(String name, int goldenMasculine, int silverMasculine, int bronzeMasculine, int goldenFemenine,
			int silverFemenine, int bronzeFemenine, int goldenMixed, int silverMixed, int bronzeMixed) {
		this.name = name;
		this.goldenMasculine = goldenMasculine;
		this.silverMasculine = silverMasculine;
		this.bronzeMasculine = bronzeMasculine;
		this.goldenFemenine = goldenFemenine;
		this.silverFemenine = silverFemenine;
		this.bronzeFemenine = bronzeFemenine;
		this.goldenMixed = goldenMixed;
		this.silverMixed = silverMixed;
		this.bronzeMixed = bronzeMixed;
	}

	public String getName() {
		return name;
	}

	public int getGoldenMasculine() {
		return goldenMasculine;
	}

	public int getSilverMasculine() {
		return silverMasculine;
	}

	public int getBronzeMasculine() {
		return bronzeMasculine;
	}

	public int getGoldenFemenine() {
		return goldenFemenine;
	}

	public int getSilverFemenine() {
		return silverFemenine;
	}

	public int getBronzeFemenine() {
		return bronzeFemenine;
	}

	public int getGoldenMixed() {
		return goldenMixed;
	}

	public int getSilverMixed() {
		return silverMixed;
	}

	public int getBronzeMixed() {
		return bronzeMixed;
	}

	public int totalGolden() {
		return getGoldenMixed() + getGoldenFemenine() + getGoldenMasculine();
	}

	public int totalSilver() {
		return getSilverMixed() + getSilverFemenine() + getSilverMasculine();
	}

	public int totalBronze() {
		return getBronzeMixed() + getBronzeFemenine() + getBronzeMasculine();
	}

	public int total() {
		return totalGolden() + totalSilver() + totalBronze();
	}

	public int totalMixed() {
		return getGoldenMixed() + getSilverMixed() + getBronzeMixed();
	}

	@Override
	public int compareTo(Department d) {
		int comparation = 0;
		if (totalGolden() == d.totalGolden()) {
			if (totalSilver() == d.totalSilver()) {
				if (totalBronze() == d.totalBronze()) {
					comparation = 0;
				} else {
					comparation = d.totalBronze() - totalBronze();
				}
			} else {
				comparation = d.totalSilver() - totalSilver();
			}
		} else {
			comparation = d.totalGolden() - totalGolden();

		}
		return comparation;

	}

	@Override
	public int compare(Department d, Department e) {
		int comparation = 0;
		if (e.goldenMixed == d.goldenMixed) {
			if (e.silverMixed == d.silverMixed) {
				if (e.bronzeMixed == d.bronzeMixed) {
					comparation = 0;
				} else {
					comparation = d.bronzeMixed - e.bronzeMixed;
				}

			} else {
				comparation = d.silverMixed - e.silverMixed;
			}
		} else {
			comparation = d.goldenMixed - e.goldenMixed;
		}
		return comparation;
	}

	public String toString2() {
		return name + " " + goldenMixed + " " + silverMixed + " " + bronzeMixed + " " + totalMixed();
	}

}
