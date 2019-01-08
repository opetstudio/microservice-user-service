package com.prisma.entity.user.client;

import java.util.List;

import com.prisma.entity.emailaccount.model.TbEmailaccount;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


// @FeignClient(name = "user-service", url = "http://localhost:8080")
@FeignClient(name = "user-service")
// @FeignClient(name = "user-service", url = "http://"+"${spring.microservices.emailaccount.host}"+":${spring.microservices.emailaccount.port}")
// @FeignClient(name = "bookStoreClient", url = "http://" + "${host}" + ":${port}", configuration = BookClientConfiguration.class)
public interface EmailaccountFeignClient {
    @GetMapping("/api/emailaccount/readbyemail/{email}")
    List findByEmail(@PathVariable("email") String email);
    
    @PostMapping("/api/emailaccount/createnew")
    Object createNew(@RequestBody TbEmailaccount Emailaccount);
    // List findByEmail(@PathVariable("email") String email);
}