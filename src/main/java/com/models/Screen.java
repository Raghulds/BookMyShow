package com.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Screen extends Base {
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Seat> seats;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Feature> features;

    @ManyToOne
    private Theatre theatre;
}
