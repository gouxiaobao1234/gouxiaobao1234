package cn.chao.controller;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class String2DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
            if (source == null || "".equals(source.trim())){
                return null;
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return sdf.parse(source);
            }catch (Exception e){
                sdf = new SimpleDateFormat("yyyy/MM/dd");
                try {
                    return sdf.parse(source);
                } catch (ParseException ex) {
                    throw new RuntimeException("传入的参数有问题");
                }
            }
    }
}
