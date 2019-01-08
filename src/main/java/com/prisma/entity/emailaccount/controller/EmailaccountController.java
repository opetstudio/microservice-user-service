package com.prisma.entity.emailaccount.controller;

import java.util.List;
import java.util.Optional;

import com.prisma.entity.emailaccount.dao.EmailaccountMongoRepository;
import com.prisma.entity.emailaccount.dao.EmailaccountRepository;
import com.prisma.entity.emailaccount.model.TbEmailaccount;
import com.prisma.entity.emailaccount.model.TbEmailaccountMongo;

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
@RequestMapping(value = "/api/emailaccount")
public class EmailaccountController {
 private static final Logger LOGGER = LoggerFactory.getLogger(EmailaccountController.class);
 
 @Autowired
 EmailaccountRepository repository;

 @Autowired
 EmailaccountMongoRepository emailaccountMongoRepository;

 @PostMapping("/create")
 public TbEmailaccount add(@RequestBody TbEmailaccount Emailaccount) {
    LOGGER.info("Emailaccount add: {}", Emailaccount);
    // throw new IllegalArgumentException("The 'name' parameter must not be null or empty");
    return repository.save(Emailaccount);
 }
 @PostMapping("/createmongo")
 public TbEmailaccountMongo addMongo(@RequestBody TbEmailaccountMongo EmailaccountMongo) {
    return emailaccountMongoRepository.save(EmailaccountMongo);
 }
 @GetMapping("/read/{id}")
 public Optional<TbEmailaccount> findById(@PathVariable("id") String id) {
  LOGGER.info("Emailaccount find: id={}", id);
  return repository.findById(id);
//   return repository.findByIdid)
 }
 @GetMapping("/readbyemail/{email}")
 public List findByEmail(@PathVariable("email") String email) {
  LOGGER.info("Emailaccount find: id={}", email);
  return repository.findByEmail(email);
 }
 @GetMapping("/read-all")
 public Iterable<TbEmailaccount> readAll() {
   Iterable<TbEmailaccount> all = repository.findAll(Sort.by("email"));
   all.forEach(System.out::println);
  return all;
 }
//  @GetMapping("/department/{departmentId}")
//  public List findByDepartment(@PathVariable("departmentId") Long departmentId) {
//   LOGGER.info("Emailaccount find: departmentId={}", departmentId);
//   // return repository.findByDepartmentId(departmentId);
//   return repository.findByDepartmentId(departmentId);
//  }
//  @GetMapping("/organization/{organizationId}")
//  public List findByOrganization(@PathVariable("organizationId") Long organizationId) {
//   LOGGER.info("Emailaccount find: organizationId={}", organizationId);
//   return repository.findByOrganizationId(organizationId);
//  }
}