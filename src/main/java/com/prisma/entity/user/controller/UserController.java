package com.prisma.entity.user.controller;

import java.util.List;
import java.util.Optional;

import com.prisma.entity.emailaccount.dao.EmailaccountMongoRepository;
import com.prisma.entity.emailaccount.dao.EmailaccountRepository;
import com.prisma.entity.emailaccount.model.TbEmailaccount;
import com.prisma.entity.msisdnaccount.dao.MsisdnaccountMongoRepository;
import com.prisma.entity.msisdnaccount.dao.MsisdnaccountRepository;
import com.prisma.entity.user.client.EmailaccountFeignClient;
import com.prisma.entity.user.client.EmailaccountService;
import com.prisma.entity.user.dao.UserMongoRepository;
import com.prisma.entity.user.dao.UserRepository;
import com.prisma.entity.user.model.TbUser;
import com.prisma.entity.user.model.TbUserMongo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
 private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
 
 @Autowired
 UserRepository repository;

 @Autowired
 UserMongoRepository userMongoRepository;

 @Autowired
 EmailaccountRepository emailaccountRepository;

 @Autowired
 EmailaccountMongoRepository emailaccountMongoRepository;

 @Autowired
 MsisdnaccountRepository msisdnaccountRepository;

 @Autowired
 MsisdnaccountMongoRepository msisdnaccountMongoRepository;

 @Autowired
 EmailaccountFeignClient emailaccountFeignClient;

 @Autowired
 EmailaccountService emailaccountService;

@PostMapping("/create")
 public TbUser add(@RequestBody TbUser User) {
    LOGGER.info("User add: {}", User);
    // throw new IllegalArgumentException("The 'name' parameter must not be null or empty");
    // TbUserMongo tbUserMongo = new TbUserMongo();
    // tbUserMongo.setId(User.getId());
    // tbUserMongo.setAppId(User.getAppId());
    // tbUserMongo.setCreatedby(User.getCreatedby());
    // tbUserMongo.setCreatedon(User.getCreatedon());
    // tbUserMongo.setEmail(User.getEmail());
    // tbUserMongo.setModifiedby(User.getModifiedby());
    // tbUserMongo.setModifiedon(User.getModifiedon());
    // tbUserMongo.setMsisdn(User.getMsisdn());
    // tbUserMongo.setName(User.getName());
    // tbUserMongo.setUsername(User.getUsername());
    // userMongoRepository.save(tbUserMongo);
    return repository.save(User);
 }
@PostMapping("/createmongo")
 public TbUserMongo add(@RequestBody TbUserMongo User) {
    LOGGER.info("User add: {}", User);
    // throw new IllegalArgumentException("The 'name' parameter must not be null or empty");
    return userMongoRepository.save(User);
 }
 @GetMapping("/read/{id}")
 public Optional<TbUser> findById(@PathVariable("id") String id) {
  LOGGER.info("User find: id={}", id);
  return repository.findById(id);
//   return repository.findByIdid)
 }
 @GetMapping("/read-all")
 public Iterable<TbUser> readAll() {
   Iterable<TbUser> all = repository.findAll(Sort.by("email"));
   all.forEach(System.out::println);
  return all;
 }
 @GetMapping("/read-emailaccount")
 public List readEmailAccount() {
  //  Iterable<TbUser> all = repository.findAll(Sort.by("email"));
  //  all.forEach(System.out::println);
  // return emailaccountService.findByEmail("opetstudio@gmail.com");
  return emailaccountFeignClient.findByEmail("testsssss");
 }
 @PostMapping("/create-emailaccount")
 public Object createEmailaccount(@RequestBody TbEmailaccount emailaccount) {
  LOGGER.info("createEmailaccount");
  return emailaccountFeignClient.createNew(emailaccount);
 }
//  @GetMapping("/department/{departmentId}")
//  public List findByDepartment(@PathVariable("departmentId") Long departmentId) {
//   LOGGER.info("User find: departmentId={}", departmentId);
//   // return repository.findByDepartmentId(departmentId);
//   return repository.findByDepartmentId(departmentId);
//  }
//  @GetMapping("/organization/{organizationId}")
//  public List findByOrganization(@PathVariable("organizationId") Long organizationId) {
//   LOGGER.info("User find: organizationId={}", organizationId);
//   return repository.findByOrganizationId(organizationId);
//  }
}