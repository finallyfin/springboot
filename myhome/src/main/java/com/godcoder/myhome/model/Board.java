package com.godcoder.myhome.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2, max=30, message="제목은 2자 이상 적어주세요") //이렇게 하면 좋은데 스프링 버전이 안맞아서 써놓긴 했는데 기능 안함(2.3.2로 다운그레이드 하면 가능)
    private String title;
    private String content;
}
