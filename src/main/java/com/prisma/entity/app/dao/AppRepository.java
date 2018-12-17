package com.prisma.entity.app.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.prisma.entity.app.model.TbApp;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// import org.springframework.data.mongodb.core.MongoTemplate;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.stereotype.Repository;


// @Repository
@RepositoryRestResource(collectionResourceRel = "app", path = "app")
public interface AppRepository extends PagingAndSortingRepository<TbApp, String> {
    // { 'location' : { '$near' : [point.x, point.y], '$maxDistance' : distance}}
    // @Override
    // default Optional<TbApp> findById(String id) {
    //     return null;
    // }
    // List<App> findByLocationNear(Point location, Distance distance);
    // List<App> findByDepartmentId(Long departmentId);
    // List<App> findByOrganizationId(Long organizationId);
    // List<App> findByCreatedbyOrderByCreatedonAsc(@Param("createdby") String createdby);
    // List<App> findByCreatedbyOrderByCreatedonDesc(@Param("createdby") String createdby);
}