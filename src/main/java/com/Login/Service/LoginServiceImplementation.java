package com.Login.Service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.Login.Exception.NoContentException;
import com.Login.Model.Admin;
import com.Login.Model.Donor;
import com.Login.Model.Requestor;





@Service("service")
public class LoginServiceImplementation implements LoginService {

 

    @Autowired
    private RestTemplate restTemplate;

 

    @Override
    public Admin loginAdmin(Admin admin) throws NoContentException {
        try {
            URI uri = URI.create("http://localhost:9092/authenticateadmin");
            return this.restTemplate.postForEntity(uri, admin, Admin.class).getBody();
        } catch (RestClientException ex) {
            throw new NoContentException("Data not found");
        }
    }

 

    @Override
    public Requestor loginRequestor(Requestor requestor) throws NoContentException {
        try {
            URI uri = URI.create("http://localhost:9094/authenticaterequestor");
            return this.restTemplate.postForEntity(uri, requestor, Requestor.class).getBody();
        } catch (RestClientException ex) {
            throw new NoContentException("Data not found");
            }
    }
    

 

    @Override
    public Donor loginDonor(Donor donor) throws NoContentException {
        try {
            URI uri = URI.create("http://localhost:9090/authenticatedonor");
            return this.restTemplate.postForEntity(uri, donor, Donor.class).getBody();
        } catch (RestClientException ex) {
            throw new NoContentException("Data not found");
        }
    }
}
