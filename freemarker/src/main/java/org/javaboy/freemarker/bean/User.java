package org.javaboy.freemarker.bean;

import lombok.Data;

/**
 * @Author Eric
 * @Date: 2020/1/5
 */
@Data
public class User {
    private Long id;

    private String username;

    private String address;

    private int gender;
}
