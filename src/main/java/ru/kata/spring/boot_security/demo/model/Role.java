package ru.kata.spring.boot_security.demo.model;


import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Transactional
@Entity
@Table (name = "authorities")
public class Role implements GrantedAuthority {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    @Id
    @PrimaryKeyJoinColumn(name = "users.username")
    @Column (name = "username", unique = true)
    private String userName;

    @Setter
    @Column (name = "authority")
    private String authority;

    public Role() {

    }

    public Role(String userName, String authority) {
        this.userName = userName;
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    //    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    private void saveRole () {
//
//    }
}
