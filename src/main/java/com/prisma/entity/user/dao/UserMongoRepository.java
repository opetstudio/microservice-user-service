package com.prisma.entity.user.dao;

import com.prisma.entity.user.model.TbUserMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "usermongo", path = "usermongo")
public interface UserMongoRepository extends MongoRepository<TbUserMongo, String> {
    // { 'location' : { '$near' : [point.x, point.y], '$maxDistance' : distance}}
    // @Override
    // default Optional<TbUser> findById(String id) {
    //     return null;
    // }
    // List<User> findByLocationNear(Point location, Distance distance);
    // List<User> findByDepartmentId(Long departmentId);
    // List<User> findByOrganizationId(Long organizationId);
    // List<User> findByCreatedbyOrderByCreatedonAsc(@Param("createdby") String createdby);
    // List<User> findByCreatedbyOrderByCreatedonDesc(@Param("createdby") String createdby);
}