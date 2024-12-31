package org.example.spring4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Spring4Application implements CommandLineRunner {

    @Autowired //램에 만들어진 주소를 자동으로 둘러보고 찾아서
    //그 주소를 오른쪽에 변수에 넣어줌.
    Environment environment; //100번 주소

    public static void main(String[] args) {
        SpringApplication.run(Spring4Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //application.properites에  있는 설정값을 가지고 와서
        //콘솔에 출력
        String port = environment.getProperty("server.port", "8080");
        System.out.println("======================================");
        System.out.println("내 스프링 부트 프로젝트 정상적으로 시작됨.");
        System.out.println("http://localhost:" + port);
        System.out.println("======================================");
    }
}