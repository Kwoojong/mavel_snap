package com.marvel.snap.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Card {

    @Id
    @Column(length = 200, nullable = false)
    private String korName;

    @Column(length = 200, nullable = false)
    private String engName;

    private int cost;
    private int power;
    private int series;

    @Builder
    public Card(String korName, String engName, int cost, int power, int series) {
        this.korName = korName;
        this.engName = engName;
        this.cost = cost;
        this.power = power;
        this.series = series;
    }
}
