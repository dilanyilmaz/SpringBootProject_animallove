package com.animallove.animallove.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_pet")
public class Pet {
    @Id
    @SequenceGenerator(
            name = "pet_sequence" ,
            sequenceName = "pet_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "pet_sequence"
    )
    private Long petId;
    @Column(name = "pet_type")
    private String type;
    @Column(name = "pet_breed")
    private String breed;
    @Column(name = "pet_name")
    private String name;
    @Column(name = "pet_old")
    private String old;
    private String explanation;


}
