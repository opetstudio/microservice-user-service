package com.prisma.entity.user.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import com.prisma.entity.emailaccount.model.TbEmailaccount;

@Service
public class EmailaccountService {
    // @Autowired
	// @LoadBalanced
    // protected RestTemplate restTemplate;
    RestTemplate restTemplate = new RestTemplate();

    @Autowired
    EmailaccountFeignClient emailaccountFeignClient;
    
    protected String serviceUrl = "http://localhost:8080";

    protected Logger logger = Logger.getLogger(EmailaccountService.class.getName());

    // public EmailaccountService(String serviceUrl) {
	// 	this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
	// 			: "http://" + serviceUrl;
    // }
    
    public List<TbEmailaccount> findByEmail(String email) {
        TbEmailaccount[] tbEmailaccount = null;
        // try {
        //     return emailaccountFeignClient.findByEmail("testsssss");
        // } catch (Exception e) {
            tbEmailaccount = restTemplate.getForObject(serviceUrl
                    + "/api/emailaccount/readbyemail/{email}", TbEmailaccount[].class, email);
        // }

        return Arrays.asList(tbEmailaccount);
    }
}