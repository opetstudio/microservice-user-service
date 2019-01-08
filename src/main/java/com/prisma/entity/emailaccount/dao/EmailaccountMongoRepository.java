package com.prisma.entity.emailaccount.dao;
import com.prisma.entity.emailaccount.model.TbEmailaccountMongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// @Repository
@RepositoryRestResource(collectionResourceRel = "emailaccountmongo", path = "emailaccountmongo")
public interface EmailaccountMongoRepository extends MongoRepository<TbEmailaccountMongo, String> {
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
    // List findByEmail(@Param("email") String email);
}