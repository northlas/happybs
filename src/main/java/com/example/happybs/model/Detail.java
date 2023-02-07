package com.example.happybs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Detail implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String author;
    private String publisher;
    private int year;

    @Lob
    private String description;
}
