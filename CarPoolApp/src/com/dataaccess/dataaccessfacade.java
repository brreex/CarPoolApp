package com.dataaccess;

import java.time.LocalDate;
import java.util.Date;

public interface dataaccessfacade {
	public boolean login(String username, String password);

	public static void registerUser(String fname, String lname, String gender, int bdate, String email, String city,
			String state, String street, int zipcode) {
	};
}
