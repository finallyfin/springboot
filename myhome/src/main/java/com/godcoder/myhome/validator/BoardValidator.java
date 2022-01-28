package com.godcoder.myhome.validator;

import com.godcoder.myhome.model.Board;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class BoardValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Board.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        Board b = (Board) obj;
        if(!StringUtils.hasText(b.getContent())) {
            errors.rejectValue("content", "key", "제목을 2자 이상 30자 이하로 적어주세요");
        }else if(2>b.getTitle().length() || 30<b.getTitle().length()){
            errors.rejectValue("title", "key", "내용을 입력하세요");
        }

    }
}
