package cn.dsx.globalresultaop.controller;

import cn.dsx.globalresultaop.annotation.ResponseResultBody;
import cn.dsx.globalresultaop.bean.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Dsx
 * @Date: 2020-09-21 21:46
 * @Description: description
 */
@RestController
@ResponseResultBody
@RequestMapping("/hello")
public class HelloController {
    private static final HashMap<String, Object> INFO;

    static {
        INFO = new HashMap<>();
        INFO.put("name", "galaxy");
        INFO.put("age", "70");
    }

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        return INFO;
    }

    @GetMapping("/result")
    @ResponseBody
    public Result<Map<String, Object>> helloResult() {
        return Result.success(INFO);
    }


    @GetMapping("/resultBody")
    //@ResponseResultBody
    public Map<String, Object> helloResultBody() {
        return INFO;
    }

    @GetMapping("/error")
    //@ResponseResultBody
    public Map<String, Object> error() {
        int i = 1 / 0;
        return INFO;
    }
}
