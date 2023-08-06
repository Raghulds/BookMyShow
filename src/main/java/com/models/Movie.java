package com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends Base {
    private String name;
    private Integer durationInMin;
    @ManyToMany
    private List<Actor> cast;
    private float rating;
}
