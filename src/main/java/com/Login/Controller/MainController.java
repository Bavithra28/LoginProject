package com.Login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Login.Exception.NoContentException;
import com.Login.Model.Admin;
import com.Login.Model.Donor;
import com.Login.Model.Requestor;
import com.Login.Service.LoginService;

@RestController
public class MainController {
	
	
	
	@Autowired
    private LoginService service;

 

    @PostMapping(value = "/loginrequestor")
    public ResponseEntity<Requestor> loginRequestor(@RequestBody Requestor requestor) throws NoContentException {
        return new ResponseEntity<>(service.loginRequestor(requestor), HttpStatus.OK);
    }

 

    @PostMapping(value = "/logindonor")
    public ResponseEntity<Donor> loginDonor(@RequestBody Donor donor) throws NoContentException {
        return new ResponseEntity<>(service.loginDonor(donor), HttpStatus.OK);

 

    }

 

    @PostMapping(value = "/loginadmin")
    public ResponseEntity<Admin> loginAdmin(@RequestBody Admin admin) throws NoContentException {
        return new ResponseEntity<>(service.loginAdmin(admin), HttpStatus.OK);
    }
   

}
