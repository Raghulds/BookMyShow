package com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Theatre extends Base {
    private String name;
    private String address;
    @OneToMany(mappedBy = "theatre", fetch = FetchType.EAGER)
    private List<Screen> screens;
}
