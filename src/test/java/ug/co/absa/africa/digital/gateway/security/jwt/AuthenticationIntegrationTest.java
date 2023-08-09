package ug.co.absa.africa.digital.gateway.security.jwt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.DirtiesContext;
import tech.jhipster.config.JHipsterProperties;
import ug.co.absa.africa.digital.gateway.config.SecurityConfiguration;
import ug.co.absa.africa.digital.gateway.config.SecurityJwtConfiguration;
import ug.co.absa.africa.digital.gateway.config.WebConfigurer;
import ug.co.absa.africa.digital.gateway.management.SecurityMetersService;
import ug.co.absa.africa.digital.gateway.web.rest.AuthenticateController;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(
    {
        JHipsterProperties.class,
        WebConfigurer.class,
        SecurityConfiguration.class,
        SecurityJwtConfiguration.class,
        SecurityMetersService.class,
        JwtAuthenticationTestUtils.class,
    }
)
@WebFluxTest(
    controllers = { AuthenticateController.class },
    properties = {
        "jhipster.security.authentication.jwt.base64-secret=fd54a45s65fds737b9aafcb3412e07ed99b267f33413274720ddbb7f6c5e64e9f14075f2d7ed041592f0b7657baf8",
        "jhipster.security.authentication.jwt.token-validity-in-seconds=60000",
    }
)
@ComponentScan({})
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface AuthenticationIntegrationTest {
}
