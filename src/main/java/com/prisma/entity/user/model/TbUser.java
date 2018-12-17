package com.prisma.entity.user.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.hibernate.annotations.GenericGenerator;
// import org.springframework.data.mongodb.core.mapping.Document;

// @Document(collection = "user")
@Entity
@Table(name = "tb_user")
public class TbUser {
    private static final Logger LOGGER = LoggerFactory.getLogger(TbUser.class);
 
    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // // @GeneratedValue(generator = "uuid2")
    // @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    // private String id;

    @Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
		name = "UUID",
		strategy = "org.hibernate.id.UUIDGenerator"
	)
	// @Column(name = “id”, updatable = false, nullable = false)
	private String id;
 
    private String name;
    private String email;
    private String username;

    private long createdon = new Date().getTime();
    private long modifiedon = new Date().getTime();
    private String createdby = "system";
    private String modifiedby = "system";

    public String getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getModifiedby() {
        return this.modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public long getModifiedon() {
        return this.modifiedon;
    }

    public void setModifiedon(long modifiedon) {
        this.modifiedon = modifiedon;
    }

    public long getCreatedon() {
        return this.createdon;
    }

    public void setCreatedon(long createdon) {
        this.createdon = createdon;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @PrePersist
    public void prePersist() {
        LOGGER.debug("prePersist|email="+this.email+"|username="+this.username+"|modifiedby="+this.modifiedby);
        if(this.username == null) {
            this.username = this.email;
        }
    }

    @PreUpdate
    public void preUpdate() {
        LOGGER.debug("preUpdate|email="+this.email+"|username="+this.username+"|modifiedby="+this.modifiedby);
    }
}