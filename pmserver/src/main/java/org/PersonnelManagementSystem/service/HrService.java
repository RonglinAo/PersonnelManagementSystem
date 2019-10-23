package org.PersonnelManagementSystem.service;

import org.PersonnelManagementSystem.bean.Hr;
import org.PersonnelManagementSystem.mapper.HrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @program: PersonnelManagementSystem
 * @description: Hr Service
 * @author: Ronglin.A
 * @create: 2019-10-21 14:04
 */
@Service
public class HrService implements UserDetailsService {
    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadHrByHrEmail(email);
        if (hr == null)
            throw new UsernameNotFoundException("用户邮箱不存在");
        return hr;
    }
}

