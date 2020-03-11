package com.example.demo.validation.constraints;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValBody implements ConstraintValidator<CardNumberVa,String> {
    @Override
    public void initialize(CardNumberVa constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        //为什么不实用split ，原因是在于使用了正则表达式，性能也相对较弱
        //npe保护不够
        //如果没有依赖的情况下，使用 StringTokenizer（不足类似于枚举）
        String[] parts = StringUtils.delimitedListToStringArray(value, "-");
        if(parts.length!=2){
            return false;
        }
        return true;
    }
}
