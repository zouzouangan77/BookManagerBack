package com.samuelangan.mycompagny.service.dto;

import com.samuelangan.mycompagny.domain.User;
import java.io.Serializable;
import lombok.Data;

/**
 * A DTO representing a user, with only the public attributes.
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String login;
    private String firstName;
    private String lastName;
    private String email;

    public UserDTO() {
        // Empty constructor needed for Jackson.
    }

    public UserDTO(User user) {
        this.id = user.getId();
        this.lastName = user.getLastName();
        this.firstName = user.getFirstName();
        this.email = user.getEmail();
        this.login = user.getLogin();
    }

    public User dtoToEntity() {
        return User.builder().id(this.id).login(this.login).build();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "UserDTO{" +
            "id='" + id + '\'' +
            ", login='" + login + '\'' +
            "}";
    }
}
