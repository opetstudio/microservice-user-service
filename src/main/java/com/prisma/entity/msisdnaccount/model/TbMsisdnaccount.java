package com.prisma.entity.msisdnaccount.model;

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
// import org.springframework.data.mongodb.core.mmsisdnaccounting.Document;

// @Document(collection = "msisdnaccount")
@Entity
@Table(name = "tb_msisdnaccount")
public class TbMsisdnaccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(TbMsisdnaccount.class);
 
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
 
    private String msisdn;
    
    private long createdon = new Date().getTime();
    private long modifiedon = new Date().getTime();
    private String createdby = "system";
    private String modifiedby = "system";

    public TbMsisdnaccount() {
    }

    public TbMsisdnaccount(String id, String msisdn, long createdon, long modifiedon, String createdby, String modifiedby) {
        this.id = id;
        this.msisdn = msisdn;
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

    public String getMsisdn() {
        return this.msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
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

    public TbMsisdnaccount id(String id) {
        this.id = id;
        return this;
    }

    public TbMsisdnaccount msisdn(String msisdn) {
        this.msisdn = msisdn;
        return this;
    }

    public TbMsisdnaccount createdon(long createdon) {
        this.createdon = createdon;
        return this;
    }

    public TbMsisdnaccount modifiedon(long modifiedon) {
        this.modifiedon = modifiedon;
        return this;
    }

    public TbMsisdnaccount createdby(String createdby) {
        this.createdby = createdby;
        return this;
    }

    public TbMsisdnaccount modifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TbMsisdnaccount)) {
            return false;
        }
        TbMsisdnaccount tbMsisdnaccount = (TbMsisdnaccount) o;
        return Objects.equals(id, tbMsisdnaccount.id) && Objects.equals(msisdn, tbMsisdnaccount.msisdn) && createdon == tbMsisdnaccount.createdon && modifiedon == tbMsisdnaccount.modifiedon && Objects.equals(createdby, tbMsisdnaccount.createdby) && Objects.equals(modifiedby, tbMsisdnaccount.modifiedby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, msisdn, createdon, modifiedon, createdby, modifiedby);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", msisdn='" + getMsisdn() + "'" +
            ", createdon='" + getCreatedon() + "'" +
            ", modifiedon='" + getModifiedon() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", modifiedby='" + getModifiedby() + "'" +
            "}";
    }
}