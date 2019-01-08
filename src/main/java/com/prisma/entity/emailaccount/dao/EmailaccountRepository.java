package com.prisma.entity.emailaccount.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.prisma.entity.emailaccount.model.TbEmailaccount;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// import org.springframework.data.mongodb.core.MongoTemplate;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.stereotype.Repository;


// @Repository
@RepositoryRestResource(collectionResourceRel = "emailaccount", path = "emailaccount")
public interface EmailaccountRepository extends PagingAndSortingRepository<TbEmailaccount, String> {
    // { 'location' : { '$near' : [point.x, point.y], '$maxDistance' : distance}}
    // @Override
    // default Optional<TbEmailaccount> findById(String id) {
    //     return null;
    // }
    // List<Emailaccount> findByLocationNear(Point location, Distance distance);
    // List<Emailaccount> findByDepartmentId(Long departmentId);
    // List<Emailaccount> findByOrganizationId(Long organizationId);
    // List<Emailaccount> findByCreatedbyOrderByCreatedonAsc(@Param("createdby") String createdby);
    // List<Emailaccount> findByCreatedbyOrderByCreatedonDesc(@Param("createdby") String createdby);
    List findByEmail(@Param("email") String email);
}