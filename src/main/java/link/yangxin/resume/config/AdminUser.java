package link.yangxin.resume.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author yangxin
 * @date 2020/1/7
 */
@Configuration
@ConfigurationProperties(prefix = "admin")
@Getter
@Setter
@ToString
public class AdminUser {

    private String username;

    private String password;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof AdminUser)) {
            return false;
        }
        AdminUser other = (AdminUser) obj;
        return StringUtils.equals(other.getPassword(), this.getPassword()) && StringUtils.equals(other.getUsername(), this.getUsername());
    }

    @Override
    public int hashCode() {
        int result = 17 * 31;
        if (this.username != null) {
            result += 31 * this.username.hashCode();
        }
        if (this.password != null) {
            result += 31 * this.password.hashCode();
        }
        return result;
    }
}