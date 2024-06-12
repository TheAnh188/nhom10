package com.example.nhom10.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;
@Data
@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CAT")
    private Long id;
    @Column(name = "NAME_CAT", nullable = false)
    private String name;
    @Column(name = "META")
    private String meta;
    @Column(name = "`ORDER`", nullable = false)
    private Long order;
    @Column(name = "LINK")
    private String link;
    @Column(name = "HIDE", nullable = false)
    private boolean hide;
    @OneToMany(mappedBy = "category")
    private Set<Product> products;
}
