package fr.formation.smellyspring.dtos;

public class SmellyUserOutDto {

    private Long id;
    private String username;

    public SmellyUserOutDto(Long id, String username) {
	this.id = id; // Assign instance variable not local variable
	this.username = username;
    }

    public Long getId() {
	return id;
    }

    public String getUsername() {
	return username;
    }

    @Override
    public String toString() {
	return "{id=" + id + ", username=" + username + "}";
    }
}
