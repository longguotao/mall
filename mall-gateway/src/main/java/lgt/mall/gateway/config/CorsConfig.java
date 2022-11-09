package lgt.mall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();

        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL); // 允许任何请求头都可跨域
        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL); // 允许所有请求方式跨域
        corsConfiguration.addAllowedOriginPattern(CorsConfiguration.ALL); // 允许所有请求来源跨域
        corsConfiguration.setAllowCredentials(Boolean.TRUE); // 允许携带 cookie 跨域

        configurationSource.registerCorsConfiguration("/**",corsConfiguration); // 拦截所有请求
        return new CorsWebFilter(configurationSource);
    }
}
