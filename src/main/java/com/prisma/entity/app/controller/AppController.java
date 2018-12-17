package com.prisma.entity.app.controller;

import java.util.List;
import java.util.Optional;

import com.prisma.entity.app.dao.AppRepository;
import com.prisma.entity.app.model.TbApp;

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
@RequestMapping(value = "/api/app")
public class AppController {
 private static final Logger LOGGER = LoggerFactory.getLogger(AppController.class);
 
 @Autowired
 AppRepository repository;

 @PostMapping("/create")
 public TbApp add(@RequestBody TbApp App) {
    LOGGER.info("App add: {}", App);
    return repository.save(App);
 }
 @GetMapping("/read/{id}")
 public Optional<TbApp> findById(@PathVariable("id") String id) {
  LOGGER.info("App find: id={}", id);
  return repository.findById(id);
//   return repository.findByIdid)
 }
 @GetMapping("/read-all")
 public Iterable<TbApp> readAll() {
   Iterable<TbApp> all = repository.findAll(Sort.by("email"));
   all.forEach(System.out::println);
  return all;
 }
//  @GetMapping("/department/{departmentId}")
//  public List findByDepartment(@PathVariable("departmentId") Long departmentId) {
//   LOGGER.info("App find: departmentId={}", departmentId);
//   // return repository.findByDepartmentId(departmentId);
//   return repository.findByDepartmentId(departmentId);
//  }
//  @GetMapping("/organization/{organizationId}")
//  public List findByOrganization(@PathVariable("organizationId") Long organizationId) {
//   LOGGER.info("App find: organizationId={}", organizationId);
//   return repository.findByOrganizationId(organizationId);
//  }
}