package com.animallove.animallove.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_owner",
        uniqueConstraints = @UniqueConstraint(
                name = "email_unique",
                columnNames = "email_address"
        )
)
public class Owner {
    @Id
    @SequenceGenerator(
            name = "owner_sequence" ,
            sequenceName = "owner_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "owner_sequence"
    )
    private Long OwnerId;
    @Column(name = "first_name",length = 50)
    private String firstName;
    @Column(name = "last_name",length = 50)
    private String lastName;
    @Column(name = "connection_address")
    private String connection;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email_address",nullable = false)
    private String eMail;

    @OneToMany(cascade = CascadeType.ALL)

    @JoinColumn(name ="owner_id" ,referencedColumnName = "OwnerId")

    private List<Pet> pets;
}
