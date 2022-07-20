package com.dattech.iTestify.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @ApiModelProperty(notes="Unique auto generated identifier for the system")
    private Integer id;

//    @ApiModelProperty(notes="Author's first name ")
    private String firstName;


//    @ApiModelProperty(notes="Author's last name ")
    private String lastName;

    @Column(name= "phone", unique = true)
//    @ApiModelProperty(notes="Author's phone number ")
    private String phone;

    @Column(unique = true)
//    @ApiModelProperty(notes="Author's email ")
    private String email;

    @OneToMany(mappedBy = "author")
//    @ApiModelProperty(notes="List of author's wikis")
    private List<Wiki> wikis;

}
