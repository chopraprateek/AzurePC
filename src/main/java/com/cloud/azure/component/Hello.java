package com.cloud.azure.component;
import com.cloud.azure.model.Greeting;
import com.cloud.azure.model.User;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Hello implements Function<User, Greeting> {

    @Override
    public Greeting apply(User user) {
        return new Greeting("Hello, " + user.getName() + "!\n");
    }
}