package com.prisma.entity.user.model;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tb_user") 
public class TbUserMongo {
    private static final Logger LOGGER = LoggerFactory.getLogger(TbUserMongo.class);
    @Id
    private String id;
    private String name;
    private String email;
    private String username = this.email;
    private String msisdn;
    private String appId;
    private long createdon = new Date().getTime();
    private long modifiedon = new Date().getTime();
    private String createdby = "system";
    private String modifiedby = "system";

    public String getCreatedby() {
        return this.createdby;
    }
    
    /**
     * @return the msisdn
     */
    public String getMsisdn() {
        return msisdn;
    }

    /**
     * @param msisdn the msisdn to set
     */
    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
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
    public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
    }
}