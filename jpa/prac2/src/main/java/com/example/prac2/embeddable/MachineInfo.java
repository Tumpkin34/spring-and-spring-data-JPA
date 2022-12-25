package com.example.prac2.embeddable;

import com.example.prac2.type.MachineRank;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
@Getter
@Setter
public class MachineInfo {
    @Enumerated(EnumType.STRING)
    private MachineRank machineEchoRank;
    private String machineAdapterType;

    public void create(MachineRank machineEchoRank, String machineAdapterType) {
        this.machineEchoRank = machineEchoRank;
        this.machineAdapterType = machineAdapterType;
    }
}
