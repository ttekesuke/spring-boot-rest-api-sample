package com.example.entity;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by ishiis on 16/09/08.
 */
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
}