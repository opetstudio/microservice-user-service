package com.prisma.entity.user.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.prisma.entity.user.model.TbUser;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// import org.springframework.data.mongodb.core.MongoTemplate;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.stereotype.Repository;


// @Repository
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends PagingAndSortingRepository<TbUser, String> {
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