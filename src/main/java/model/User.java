package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    @Override
    public boolean equals(Object obj) {
        return this.getId() == ((User) obj).getId();
    }
    public User(int id){
        this.id = id;
    }
    private int id;
    private int age;
    private String password;
    private String username;
    private String login;
    public User(int id, int age, String password, String username, String login) {
        this.id = id;
        this.age = age;
        this.password = password;
        this.username = username;
        this.login = login;
    }
}
