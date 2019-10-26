package org.PersonnelManagementSystem.tool;

import org.PersonnelManagementSystem.bean.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @program: PersonnelManagementSystem
 * @description: 获取当前登录的Hr的信息
 * @author: Ronglin.A
 * @create: 2019-10-21 11:53
 */
public class HrUtils {
    public static Hr getCurrentHr() {
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
