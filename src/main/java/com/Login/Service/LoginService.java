package com.Login.Service;

import com.Login.Model.Admin;
import com.Login.Model.Donor;
import com.Login.Model.Requestor;

public interface LoginService {
	
	
	public Admin loginAdmin(Admin admin);
    public Requestor loginRequestor(Requestor requestor);
    public Donor loginDonor(Donor donor);

}
