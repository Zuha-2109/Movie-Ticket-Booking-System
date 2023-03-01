package com.example.Book_my_show_backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Date;

@Entity
@Table(name = "movies")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column(nullable = false,unique = true)
    private String movieName;

    private int duration;

    @Temporal(TemporalType.DATE)
    private Data releaseDate;

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    List<ShowEntity> listofShows;
}
