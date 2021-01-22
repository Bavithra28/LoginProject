package com.Login.Service;

import com.Login.Model.Admin;
import com.Login.Model.Donor;
import com.Login.Model.Requestor;

public class LoginServiceImplementation implements LoginService {

	@Override
	public Admin loginAdmin(Admin admin) {
				return admin;
	}

	@Override
	public Requestor loginRequestor(Requestor requestor) {
				return requestor;
	}

	@Override
	public Donor loginDonor(Donor donor) {
				return donor;
	}

}

