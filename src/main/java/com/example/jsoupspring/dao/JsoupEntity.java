package com.example.jsoupspring.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Jsoup")




public class JsoupEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String title;


}
