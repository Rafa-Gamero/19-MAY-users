package com.ironhack.users_micro.dto;

import java.util.List;

public class UserWithAccountsDTO {
    private Integer id;
    private String name;
    private String email;
    private String username;
    private List<AccountDTO> accounts;

    // Constructor vacío
    public UserWithAccountsDTO() {
    }

    // Constructor con parámetros
    public UserWithAccountsDTO(Integer id, String name, String email, String username, List<AccountDTO> accounts) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.username = username;
        this.accounts = accounts;
    }
    // Getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public List<AccountDTO> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountDTO> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "UserWithAccountsDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
