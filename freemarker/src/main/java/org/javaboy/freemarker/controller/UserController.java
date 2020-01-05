package org.javaboy.freemarker.controller;

import org.javaboy.freemarker.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author Eric
 * @Date: 2020/1/5
 */
@Controller
public class UserController {
    @GetMapping("/user")
    public String user(Model model) {
        List<User> users = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId((long) i);
            user.setUsername("user--" + i);
            user.setAddress("javaboy--" + i);
            user.setGender(random.nextInt(3));//0 男 1女 其他：未知
            users.add(user);
        }

        model.addAttribute("users", users);
        return "user";
    }
}
