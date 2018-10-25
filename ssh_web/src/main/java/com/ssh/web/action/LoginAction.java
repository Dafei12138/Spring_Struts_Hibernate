package com.ssh.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

    private String name;
    private String password;

    public String execute(){
        if("admin".equalsIgnoreCase(name) && "123".equalsIgnoreCase(password)){
            return SUCCESS;
        }
        return LOGIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
