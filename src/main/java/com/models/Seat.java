package com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends Base {
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
}
