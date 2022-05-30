package com.jd.movieticketstrading.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

     @JsonProperty(value = "name",required=true)
     private String name;

     @JsonProperty(value = "age",required=true)
     private Long age;
}
