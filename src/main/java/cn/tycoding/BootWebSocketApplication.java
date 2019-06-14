package cn.tycoding;

import cn.tycoding.config.RequestListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author tycoding
 * @date 2019-06-11
 */
@SpringBootApplication
public class BootWebSocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootWebSocketApplication.class, args);
    }

    @Autowired
    private RequestListener requestListener;

    @Bean
    public ServletListenerRegistrationBean<RequestListener> servletListenerRegistrationBean() {
        ServletListenerRegistrationBean<RequestListener> servletListenerRegistrationBean = new ServletListenerRegistrationBean<>();
        servletListenerRegistrationBean.setListener(requestListener);
        return servletListenerRegistrationBean;
    }
}
