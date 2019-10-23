package org.PersonnelManagementSystem.tool;

import java.util.UUID;

/**
 * @program: PersonnelManagementSystem
 * @description: UUID生成器
 * @author: Ronglin.A
 * @create: 2019-10-21 11:53
 */
public class UuidGenerator {
    public static void main(String[] args) {
        //每次生成10个UUID
        for (int i = 0; i < 10; i++)
            System.out.println(UUID.randomUUID().toString());
    }
}
