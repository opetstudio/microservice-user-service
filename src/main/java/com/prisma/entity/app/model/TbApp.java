package com.prisma.entity.app.model;

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
// import org.springframework.data.mongodb.core.mapping.Document;

// @Document(collection = "app")
@Entity
@Table(name = "tb_app")
public class TbApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(TbApp.class);
 
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
    private String description;

    private long createdon = new Date().getTime();
    private long modifiedon = new Date().getTime();
    private String createdby = "system";
    private String modifiedby = "system";

    public TbApp() {
    }

    public TbApp(String id, String name, String description, long createdon, long modifiedon, String createdby, String modifiedby) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public TbApp id(String id) {
        this.id = id;
        return this;
    }

    public TbApp name(String name) {
        this.name = name;
        return this;
    }

    public TbApp description(String description) {
        this.description = description;
        return this;
    }

    public TbApp createdon(long createdon) {
        this.createdon = createdon;
        return this;
    }

    public TbApp modifiedon(long modifiedon) {
        this.modifiedon = modifiedon;
        return this;
    }

    public TbApp createdby(String createdby) {
        this.createdby = createdby;
        return this;
    }

    public TbApp modifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TbApp)) {
            return false;
        }
        TbApp tbApp = (TbApp) o;
        return Objects.equals(id, tbApp.id) && Objects.equals(name, tbApp.name) && Objects.equals(description, tbApp.description) && createdon == tbApp.createdon && modifiedon == tbApp.modifiedon && Objects.equals(createdby, tbApp.createdby) && Objects.equals(modifiedby, tbApp.modifiedby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, createdon, modifiedon, createdby, modifiedby);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", createdon='" + getCreatedon() + "'" +
            ", modifiedon='" + getModifiedon() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", modifiedby='" + getModifiedby() + "'" +
            "}";
    }
}