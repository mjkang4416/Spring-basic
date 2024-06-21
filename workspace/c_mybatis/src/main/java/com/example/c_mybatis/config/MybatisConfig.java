package com.example.c_mybatis.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//스프링에서 설정할 때 쓰는 클래스 의미
//메소드들에는 bean 어노테이션 붙여서 등록 컴포넌트는 클레스를 등록하는거
@Configuration
//final 필드인 애들의 생성자를 만들어줌
@RequiredArgsConstructor
public class MybatisConfig {

    //xml 설정파일 등 리소스 파일 읽어오기 위해 주입받음, 경로로 찾아가서 해당파일 가져옴
    private final ApplicationContext applicationContext;

    //application.priperties 에 들어가서 spring.datasource.hikari로 시작하는 정보 다 가져와라는 뜻
    @ConfigurationProperties(prefix ="spring.datasource.hikari")
    @Bean
    //hikariConfig 객체 반환
    public HikariConfig hikariConfig(){
        return new HikariConfig();
    }

    //DataSource 는 인터페이스 !
    //데이터베이스 연결 위한 설정 전달받아 datasource를 반환
    //DataSource는 커넥션 풀을 관리한다
    @Bean
    public DataSource dataSource(){
        return new HikariDataSource(hikariConfig());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        //sqlSessionBean 은 SqlSessionFactory를 생성하고 설정하는 역할을 함
        //SqlSessionFactory 실제 sql 세션관리, 실행 역할 함
        //xml 을 실제 쿼리로 변환
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //데이터 소스를 저장
        sqlSessionFactoryBean.setDataSource(dataSource());

        //mapper는 테이블 마다 만드는게 일반적
        //mabatis 메퍼 파일의 위치 설정
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mapper/*.xml"));

        //mybatis 설정파일의 위치를 설정
        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:config/config.xml"));

        //객체 생성
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();

        //_ 를 카멜로 자동맵핑
        sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);


        return sqlSessionFactory;
    }

}
