package com.company.single.entity;

import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table(name = "SINGLE_MULTI")
@Entity(name = "single_Multi")
public class Multi extends Dict {
    private static final long serialVersionUID = -7513284612226934309L;

    @Column(name = "DESCRIPTION")
    private String title;


    @OnDeleteInverse(DeletePolicy.DENY)
    @OneToMany(mappedBy = "multi")
    private List<Single> single;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Single> getSingle() {
        return single;
    }

    public void setSingle(List<Single> single) {
        this.single = single;
    }
}