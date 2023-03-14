package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {


    /*private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }*/

    /*private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }*/
    private final MemberRepository memberRepository;

    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    /*@Bean   // Config 에 Bean 으로 직접등록
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    }*/

    /*@Bean
    public MemberRepository memberRepository()
    {
        //return new MemoryMemberRepository(); //db없이 메모리만
        //return new JdbcMemberRepository(dataSource);  //순수jdbc
        //return new JdbcTemplateMemberRepository(dataSource);  //jdbc템플릿 응용
        //return new JpaMemberRepository(em);   // jpa사용
    }*/
}
