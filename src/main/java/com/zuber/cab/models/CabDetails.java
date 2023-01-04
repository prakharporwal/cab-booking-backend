package com.zuber.cab.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import javax.persistence.*;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cab_details")
@EqualsAndHashCode
public class CabDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @JsonProperty(value = "model_dance")
    private String modelName;
    private String cabNumber;
    private String chasisNumber;
}
