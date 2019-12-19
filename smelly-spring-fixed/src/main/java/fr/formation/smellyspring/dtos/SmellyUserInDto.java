package fr.formation.smellyspring.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SmellyUserInDto {

    @NotBlank // To avoid "Stranger Things" exception... and to be consistent with database
	      // column definition
    @Size(min = 6, max = 255)
    private String username; // Rename to "username", to avoid "Stranger Things" exception... and to obey
			     // conventions
    @NotBlank
    @Size(min = 8, max = 12)
    private String password;

    public SmellyUserInDto(String username, String password) {
	this.username = username;
	this.password = password;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
}
