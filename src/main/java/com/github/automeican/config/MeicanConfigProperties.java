package com.github.automeican.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MeicanConfigProperties
 * @Description
 * @Author liyongbing
 * @Date 2022/9/22 15:50
 * @Version 1.0
 **/
@Data
@ConfigurationProperties(prefix = "meican.config",ignoreInvalidFields = true)
@Configuration
public class MeicanConfigProperties {
    private String client_id = "Xqr8w0Uk4ciodqfPwjhav5rdxTaYepD";
    private String client_secret = "vD11O6xI9bG3kqYRu9OyPAHkRGxLh4E";
    private String baseUrl = "https://www.meican.com";
    private String addressUniqueId = "9a685dc748e5";
    private String sysAccount = "18762036036@shinho.net.cn";

}
