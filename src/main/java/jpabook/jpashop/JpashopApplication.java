package jpabook.jpashop;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpashopApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpashopApplication.class, args);
    }


        // mappedby 된 엔티티의 무한루프를 피하기 위해 JsonIgnore을 붙여 준 뒤 발생하는 프록시 에러 해결 방법
        // gradle 설치 후 빈 설정
        // 사실상 엔티티를 외부로 그대로 노출하면 안되기 때문에 이방법은 사용할 필요 없음

        @Bean
        Hibernate5Module hibernate5Module() {
            return new Hibernate5Module();
        }



}
