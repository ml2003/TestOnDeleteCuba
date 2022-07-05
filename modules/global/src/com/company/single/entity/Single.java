package com.company.single.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "SINGLE_SINGLE")
@Entity(name = "single_Single")
public class Single extends Dict {
    private static final long serialVersionUID = -6154107844860801840L;

    @NotNull
    @Column(name = "NUM")
    private String num;

    @Column(name = "DESCRIPTION")
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MULTI_ID")
    private Multi multi;

    public Multi getMulti() {
        return multi;
    }

    public void setMulti(Multi multi) {
        this.multi = multi;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}