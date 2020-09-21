package cn.dsx.globalresultaop.annotation;

import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.*;

/**
 * @Author: Dsx
 * @Date: 2020-09-21 21:49
 * @Description: 自定义注解  用于拦截返回值判断  可以作用在类上或者方法上  作用在类上 则该类下的所有方法 都有该注解属性
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
@ResponseBody
public @interface ResponseResultBody {
}
