package com.example.prac2.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("WashingMachine")
@Table(name = "TBL_WASHING_MACHINE")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WashingMachine extends Machine{
    private int washingMachineVolume;

    public WashingMachine(String machineName, LocalDateTime machineReleaseDate, int washingMachineVolume) {
        super.create(machineName,machineReleaseDate);
        this.washingMachineVolume = washingMachineVolume;
    }
}
