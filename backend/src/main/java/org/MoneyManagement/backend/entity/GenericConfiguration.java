package org.MoneyManagement.backend.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name ="generic_configuration")
public class GenericConfiguration {

    @Id
    private String id;

    private Date createdAt;

    private String genericConfigKey;

    private String genericConfigValue;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getGenericConfigKey() {
        return this.genericConfigKey;
    }

    public void setGenericConfigKey(String genericConfigKey) {
        this.genericConfigKey = genericConfigKey;
    }

    public String getGenericConfigValue() {
        return this.genericConfigValue;
    }

    public void setGenericConfigValue(String genericConfigValue) {
        this.genericConfigValue = genericConfigValue;
    }
}
