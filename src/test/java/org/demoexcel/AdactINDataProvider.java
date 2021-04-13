package org.demoexcel;

import org.testng.annotations.DataProvider;

public class AdactINDataProvider {

	@DataProvider(name = "Data")
	public static Object[][] loginData() {
		return new Object[][] { { "satzsatiya", "sathya@123" }, { "ahamedgreens", "greens" } };

	}

	@DataProvider(name = "SearchData")
	public static Object[][] searchData() {
		return new Object[][] { { "Sydney", "3", "Deluxe", "3 - Three", "2", "2 - Two" },
				{ "Melbourne", "3", "Super Deluxe", "3 - Three", "2", "2 - Two" } };
	}

	@DataProvider(name = "BookData")
	public static Object[][] bookData() {
		return new Object[][] {
				{ "ahamed", "ibrahim", "thoraipakkam, jain college,chennai", "1234567890123456", "MAST", "October",
						"12", "345" },
				{ "sathya", "sathya", "thiruvanmiyyur", "0987654321098765", "MAST", "July", "11", "456" } };
	}

}
