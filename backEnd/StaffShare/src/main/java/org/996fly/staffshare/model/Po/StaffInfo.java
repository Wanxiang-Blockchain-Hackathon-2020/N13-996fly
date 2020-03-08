package org.996fly.staffshare.model.Po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class StaffInfo implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    private String weid;
    private String description;

    public StaffInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeid() {
        return weid;
    }

    public void setWeid(String weid) {
        this.weid = weid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StaffInfo(String weid, String description) {
        this.weid = weid;
        this.description = description;
    }
}
