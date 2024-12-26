package org.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {

    @Autowired
    private Environment environment; // 100번 주소

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        String port = environment.getProperty("server.port", "8080");
        System.out.println("====================================");
        System.out.println("내 스트링 부트 프로젝트 정상적으로 작동됨. ");
        System.out.println("http://localhost:" + port + "/");
        System.out.println("====================================");
        //application.properties에 있는 설정값을 갖고 와서
        // 콘솔에 출력

    }
}
