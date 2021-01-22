package com.Login.Service;

import com.Login.Exception.NoContentException;
import com.Login.Model.Admin;
import com.Login.Model.Donor;
import com.Login.Model.Requestor;

public interface LoginService {
	
	
	public Admin loginAdmin(Admin admin) throws NoContentException;
    public Requestor loginRequestor(Requestor requestor) throws NoContentException;
    public Donor loginDonor(Donor donor) throws NoContentException;

}
