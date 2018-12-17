package com.prisma.entity.msisdnaccount.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.prisma.entity.msisdnaccount.model.TbMsisdnaccount;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// import org.springframework.data.mongodb.core.MongoTemplate;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.stereotype.Repository;


// @Repository
@RepositoryRestResource(collectionResourceRel = "msisdnaccount", path = "msisdnaccount")
public interface MsisdnaccountRepository extends PagingAndSortingRepository<TbMsisdnaccount, String> {
    // { 'location' : { '$near' : [point.x, point.y], '$maxDistance' : distance}}
    // @Override
    // default Optional<TbMsisdnaccount> findById(String id) {
    //     return null;
    // }
    // List<Msisdnaccount> findByLocationNear(Point location, Distance distance);
    // List<Msisdnaccount> findByDepartmentId(Long departmentId);
    // List<Msisdnaccount> findByOrganizationId(Long organizationId);
    // List<Msisdnaccount> findByCreatedbyOrderByCreatedonAsc(@Param("createdby") String createdby);
    // List<Msisdnaccount> findByCreatedbyOrderByCreatedonDesc(@Param("createdby") String createdby);
}