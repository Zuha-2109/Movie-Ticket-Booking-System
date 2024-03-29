package com.example.Book_my_show_backend.ResponseDtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowResponseDto {

    private int id;

    private LocalDate showDate;

    private LocalTime showTime;

    private Double multiplier;

    private String movieName;

    private int theaterId;
}
