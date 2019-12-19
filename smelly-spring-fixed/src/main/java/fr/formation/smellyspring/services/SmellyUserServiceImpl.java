package fr.formation.smellyspring.services;

import org.springframework.stereotype.Service;

import fr.formation.smellyspring.dtos.SmellyUserInDto;
import fr.formation.smellyspring.dtos.SmellyUserOutDto;
import fr.formation.smellyspring.entities.SmellyUser;
import fr.formation.smellyspring.repositories.SmellyUserRepository;

@Service // Missing @Service annotation
public class SmellyUserServiceImpl implements SmellyUserService {

    // @Autowired to fix missing bean on non final field
    private final SmellyUserRepository repo;

    protected SmellyUserServiceImpl(SmellyUserRepository repo) {
	// Constructor injection instead of field is prefered
	this.repo = repo;
    }

    @Override
    public SmellyUserOutDto getSmellyUserOutDto() {
	return new SmellyUserOutDto(null, "Hello smelly user!");
    }

    @Override
    public SmellyUserOutDto create(SmellyUserInDto dto) { // Remove redundant @Valid with Controller
	SmellyUser entity = SmellyUserServiceHelper.convert(dto);
	repo.save(entity);
	return SmellyUserServiceHelper.convert(entity);
    }
}
