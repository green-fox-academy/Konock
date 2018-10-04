package com.greenfoxacademy.corsacorientationexam.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Spaceship {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private int max_capacity = 60;
  private String planet;
  private int utilization;

}
