package com.prisma.entity.emailaccount.model;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tb_emailaccount")
public class TbEmailaccountMongo {
    private static final Logger LOGGER = LoggerFactory.getLogger(TbEmailaccountMongo.class);
    
    @Id
    private String id;
    private String email;
    private long createdon = new Date().getTime();
    private long modifiedon = new Date().getTime();
    private String createdby = "system";
    private String modifiedby = "system";

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the createdon
     */
    public long getCreatedon() {
        return createdon;
    }

    /**
     * @param createdon the createdon to set
     */
    public void setCreatedon(long createdon) {
        this.createdon = createdon;
    }

    /**
     * @return the modifiedon
     */
    public long getModifiedon() {
        return modifiedon;
    }

    /**
     * @param modifiedon the modifiedon to set
     */
    public void setModifiedon(long modifiedon) {
        this.modifiedon = modifiedon;
    }

    /**
     * @return the createdby
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * @param createdby the createdby to set
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    /**
     * @return the modifiedby
     */
    public String getModifiedby() {
        return modifiedby;
    }

    /**
     * @param modifiedby the modifiedby to set
     */
    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}