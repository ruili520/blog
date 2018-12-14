package com.group.blog.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class AutoModel implements Dto {
    @Id
    @GenericGenerator(name="idGenerator", strategy="uuid") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator="idGenerator")
    private String id;

    public AutoModel() {
    }

    public AutoModel(String id) {
        this.setId(id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other != null && other.getClass().isAssignableFrom(this.getClass())) {
            Object otherId = ((AutoModel)other).getId();
            if (this.id == null) {
                return false;
            } else {
                return otherId == null ? false : this.id.equals(otherId);
            }
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.id == null ? super.hashCode() : this.id.hashCode();
    }
}
