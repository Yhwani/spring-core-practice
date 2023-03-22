package hello.core;

import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // hello.core부터 뒤진다
        excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class)

)
public class AutoAppConfig {
//    @Bean(name = "memoryMemberRepository")
//    MemoryMemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
