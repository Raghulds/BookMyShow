package com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class City extends Base {
    public String name;
    @OneToMany(fetch = FetchType.EAGER)
    public List<Theatre> theatres;
}
