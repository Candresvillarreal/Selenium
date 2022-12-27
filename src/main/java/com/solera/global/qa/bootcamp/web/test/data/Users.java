package com.solera.global.qa.bootcamp.web.test.data;


import com.solera.global.qa.bootcamp.web.behavior.data.types.User;

public class Users {

    String standardUser = "standard_user";
    String lockedUser = "locked_out_user";
    String problemUser = "problem_user";
    String glitchUser = "performance_glitch_user";
    String password = "secret_sauce";

    Users(){

    }

    public User getStandardUser() {
        return new User(standardUser, password);
    }

    public User getStandardUserWithIncorrectPassword() {
        return new User(standardUser, "1234");
    }

    public User getStandardUserWithOutPassword() {
        return new User(standardUser, "");
    }

    public User getLockedOutUser() {
        return new User(lockedUser, password);
    }

    public User getProblemUser() {
        return new User(problemUser, password);
    }

    public User getPerformanceGlitchUser() {
        return new User(glitchUser, password);
    }

}
