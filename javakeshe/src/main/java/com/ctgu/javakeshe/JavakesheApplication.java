package com.ctgu.javakeshe;

import com.ctgu.javakeshe.dao.CollectDao;
import com.ctgu.javakeshe.entity.Collect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ctgu.javakeshe.dao")
public class JavakesheApplication {

    public static void main(String[] args) { SpringApplication.run(JavakesheApplication.class, args);
    }

}
