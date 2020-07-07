package redis;

import java.io.Serializable;

/**
 * @author lixiao
 * @version 1.0
 * @date 2020/7/1 10:15
 */
public class User implements Serializable {

    private Long id;
    private String username;
    private String password;

    @RedisBeanField
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @RedisBeanField
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @RedisBeanField
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
