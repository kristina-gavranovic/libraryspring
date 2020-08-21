package com.kristina.libraryspring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Author implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column
    Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;
}
