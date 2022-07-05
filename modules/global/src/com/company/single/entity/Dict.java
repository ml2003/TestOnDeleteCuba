package com.company.single.entity;

import com.haulmont.chile.core.annotations.NamePattern;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

@MappedSuperclass
@NamePattern("%s|name")
public class Dict extends Obj {
    private static final long serialVersionUID = -7398162267087029516L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}