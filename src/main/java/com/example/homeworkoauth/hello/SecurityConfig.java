package com.example.homeworkoauth.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.endpoint.NimbusAuthorizationCodeTokenResponseClient;
import org.springframework.security.oauth2.client.endpoint.OAuth2AccessTokenResponseClient;
import org.springframework.security.oauth2.client.endpoint.OAuth2AuthorizationCodeGrantRequest;
import org.springframework.security.oauth2.client.web.AuthorizationRequestRepository;
import org.springframework.security.oauth2.client.web.HttpSessionOAuth2AuthorizationRequestRepository;
import org.springframework.security.oauth2.core.endpoint.OAuth2AuthorizationRequest;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/oauth_login")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .oauth2Login()
                .loginPage("/oauth_login")

                //인증시 내부에서 먼저 진입후 가는거같음
//                .authorizationEndpoint()
//                    .baseUri("/oauth2/authorize-client")
//                    .authorizationRequestRepository(authorizationRequestRepository())
//                    .and()

                //먼지모르겟슴
                .tokenEndpoint()
                .accessTokenResponseClient(accessTokenResponseClient())
                .and()

                    //Note that if we change it, we also have to update the redirectUriTemplate property of each ClientRegistration and add the new URI as an authorized redirect URI for each client.
//                    .redirectionEndpoint()
//                    .baseUri("/oauth2/redirect")

                .defaultSuccessUrl("/loginSuccess")
                .failureUrl("/loginFailure")

        ;

    }

    @Bean
    public OAuth2AccessTokenResponseClient<OAuth2AuthorizationCodeGrantRequest> accessTokenResponseClient() {
        return new NimbusAuthorizationCodeTokenResponseClient();
    }

    @Bean
    public AuthorizationRequestRepository<OAuth2AuthorizationRequest> authorizationRequestRepository(){
            return new HttpSessionOAuth2AuthorizationRequestRepository();
    }


}