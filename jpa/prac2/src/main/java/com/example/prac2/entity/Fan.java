package com.example.prac2.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("Fan")
@Data
@Table(name = "TBL_FAN")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Fan extends Machine{
    private int fanWing;

    public void create(String machineName, LocalDateTime machineReleaseDate, int fanWing) {
        super.create(machineName,machineReleaseDate);
        this.fanWing = fanWing;
    }
}
