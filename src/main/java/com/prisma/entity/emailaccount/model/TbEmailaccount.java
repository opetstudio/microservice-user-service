package com.prisma.entity.emailaccount.model;

import java.util.Date;
import java.util.Objects;
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
// import org.springframework.data.mongodb.core.memailaccounting.Document;

// @Document(collection = "emailaccount")
@Entity
@Table(name = "tb_emailaccount")
public class TbEmailaccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(TbEmailaccount.class);
 
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
 
    private String email;
    
    private long createdon = new Date().getTime();
    private long modifiedon = new Date().getTime();
    private String createdby = "system";
    private String modifiedby = "system";

    public TbEmailaccount() {
    }

    public TbEmailaccount(String id, String email, long createdon, long modifiedon, String createdby, String modifiedby) {
        this.id = id;
        this.email = email;
        this.createdon = createdon;
        this.modifiedon = modifiedon;
        this.createdby = createdby;
        this.modifiedby = modifiedby;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCreatedon() {
        return this.createdon;
    }

    public void setCreatedon(long createdon) {
        this.createdon = createdon;
    }

    public long getModifiedon() {
        return this.modifiedon;
    }

    public void setModifiedon(long modifiedon) {
        this.modifiedon = modifiedon;
    }

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

    public TbEmailaccount id(String id) {
        this.id = id;
        return this;
    }

    public TbEmailaccount email(String email) {
        this.email = email;
        return this;
    }

    public TbEmailaccount createdon(long createdon) {
        this.createdon = createdon;
        return this;
    }

    public TbEmailaccount modifiedon(long modifiedon) {
        this.modifiedon = modifiedon;
        return this;
    }

    public TbEmailaccount createdby(String createdby) {
        this.createdby = createdby;
        return this;
    }

    public TbEmailaccount modifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TbEmailaccount)) {
            return false;
        }
        TbEmailaccount tbEmailaccount = (TbEmailaccount) o;
        return Objects.equals(id, tbEmailaccount.id) && Objects.equals(email, tbEmailaccount.email) && createdon == tbEmailaccount.createdon && modifiedon == tbEmailaccount.modifiedon && Objects.equals(createdby, tbEmailaccount.createdby) && Objects.equals(modifiedby, tbEmailaccount.modifiedby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, createdon, modifiedon, createdby, modifiedby);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", email='" + getEmail() + "'" +
            ", createdon='" + getCreatedon() + "'" +
            ", modifiedon='" + getModifiedon() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", modifiedby='" + getModifiedby() + "'" +
            "}";
    }
}