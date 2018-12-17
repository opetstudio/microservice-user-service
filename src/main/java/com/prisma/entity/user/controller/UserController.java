package com.prisma.entity.user.controller;

import java.util.List;
import java.util.Optional;

import com.prisma.entity.user.dao.UserRepository;
import com.prisma.entity.user.model.TbUser;

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
@RequestMapping(value = "/api/User")
public class UserController {
 private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
 
 @Autowired
 UserRepository repository;

 @PostMapping("/create")
 public TbUser add(@RequestBody TbUser User) {
    LOGGER.info("User add: {}", User);
    return repository.save(User);
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