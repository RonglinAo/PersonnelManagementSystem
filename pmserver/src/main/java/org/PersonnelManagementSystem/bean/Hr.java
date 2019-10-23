package org.PersonnelManagementSystem.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @program: PersonnelManagementSystem
 * @description: Hr Bean
 * @author: Ronglin.A
 * @create: 2019-10-20 11:06
 */
public class Hr implements Serializable, UserDetails {
    private Long id;
    //使用email作为用户名
    private String email;
    private String phone;
    private String telephone;
    private String password;
    private String name;
    private String address;
    private String avatar;
    private String remark;
    private boolean enable;
    private List<Role> roles;

    public Hr() {
    }

    @Override
    public String getUsername() {
        //使用email作为用户名
        return email;
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        //遍历roles来获得所有的权限
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    public void setRole(List<Role> roles) {
        this.roles = roles;
    }
}