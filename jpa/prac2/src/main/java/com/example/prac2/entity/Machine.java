package com.example.prac2.entity;

import com.example.prac2.type.MachineRank;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "MACHINE_TYPE")
@Table(name = "TBL_MACHINE")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Machine extends Period{
    @Id @GeneratedValue
    private Long machineId;
    private String machineName;
    private LocalDateTime machineReleaseDate;

    public void create(String machineName, LocalDateTime machineReleaseDate) {
        this.machineName = machineName;
        this.machineReleaseDate = machineReleaseDate;
    }
}
