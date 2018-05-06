package cn.merryyou.security.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * Created on 2018/1/24 0024.
 *
 * @author zlf
 * @email i@merryyou.cn
 * @since 1.0
 */
@Data
@ConfigurationProperties(prefix = "merryyou.security.oauth2")
public class OAuth2Properties {

    private String jwtSigningKey = "merryyou";

    private OAuth2ClientProperties[] clients = {};

    public String getJwtSigningKey() {
      return jwtSigningKey;
    }

    public void setJwtSigningKey(String jwtSigningKey) {
      this.jwtSigningKey = jwtSigningKey;
    }

    public OAuth2ClientProperties[] getClients() {
      return clients;
    }

    public void setClients(OAuth2ClientProperties[] clients) {
      this.clients = clients;
    }
}
