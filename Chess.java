package com.xworkz.fundamentals.custom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Chess {
   private int playerId;
   private String name;
   private float fideRating;
}
