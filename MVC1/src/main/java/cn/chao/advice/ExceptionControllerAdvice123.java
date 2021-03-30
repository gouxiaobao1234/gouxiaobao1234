package cn.chao.advice;

import cn.chao.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionControllerAdvice {

312321
全额问问去额

    // 处理返回错误页面
    @ExceptionHandler(value = {Exception.class})
    public ModelAndView myExceptionToPage(Exception e){
        MyException exception = null;
        if(e instanceof MyException){
            exception = (MyException) e;
        }else {
            exception = new MyException("狗鑫跟老甲鱼跑啦...");
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("error",exception.getMessage());
        mv.setViewName("error");

        return mv;
    }
}
