package com.tyj.Eccormerce.entity;

import com.tyj.Eccormerce.enums.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "Name is required")
    private String name;

    @Column(unique = true)
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Password number is required")
    private String password;

    @Column(name = "Phone_number")
    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

    private UserRole role;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<OrderItem> orderItemList;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Address address;

    @Column(name = "created_at")
    private final LocalDateTime createAt = LocalDateTime.now();

    public @NotBlank(message = "Email is required") String getEmail() {
        return email;
    }

    public @NotBlank(message = "Password number is required") String getPassword() {
        return password;
    }

    public @NotBlank(message = "Phone number is required") String getPhoneNumber() {
        return phoneNumber;
    }

    public UserRole getRole() {
        return role;
    }

    public long getId() {
        return id;
    }

    public @NotBlank(message = "Name is required") String getName() {
        return name;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public Address getAddress() {
        return address;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(@NotBlank(message = "Name is required") String name) {
        this.name = name;
    }

    public void setEmail(@NotBlank(message = "Email is required") String email) {
        this.email = email;
    }

    public void setPassword(@NotBlank(message = "Password number is required") String password) {
        this.password = password;
    }

    public void setPhoneNumber(@NotBlank(message = "Phone number is required") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}