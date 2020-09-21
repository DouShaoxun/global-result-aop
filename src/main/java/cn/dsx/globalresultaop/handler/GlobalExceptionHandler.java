package cn.dsx.globalresultaop.handler;

import cn.dsx.globalresultaop.bean.Result;
import cn.dsx.globalresultaop.bean.ResultStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @Author: Dsx
 * @Date: 2020-09-21 21:59
 * @Description: description
 */
@Slf4j
@Configuration
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    public Result<ResultStatus> ExceptionHandler(HttpServletRequest request, Exception e){
        HashMap<String, Object> map = new HashMap<>();
        //绑定异常是需要明确提示给用户的
        if(e instanceof Exception){
            return Result.failure(ResultStatus.BAD_REQUEST);
        }
        return Result.failure(ResultStatus.INTERNAL_SERVER_ERROR);

    }


}
