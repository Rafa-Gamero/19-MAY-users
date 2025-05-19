package com.ironhack.users_micro.dto;





public class AccountDTO {
    private Long id;
    private Long ownerId;
    private String isbn;
    private java.math.BigDecimal balance;

    public AccountDTO() {
        // Constructor sin argumentos (puede estar vacío o tener lógica de inicialización)
    }

    // Constructor con argumentos (si lo necesitas)
    public AccountDTO(Long id, Long ownerId, String isbn, java.math.BigDecimal balance) {
        this.id = id;
        this.ownerId = ownerId;
        this.isbn = isbn;
        this.balance = balance;
    }

    // Getters y setters (necesarios para acceder a los atributos)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public java.math.BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(java.math.BigDecimal balance) {
        this.balance = balance;
    }
}