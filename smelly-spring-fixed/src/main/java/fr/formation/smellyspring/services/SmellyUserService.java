package fr.formation.smellyspring.services;

import fr.formation.smellyspring.dtos.SmellyUserInDto;
import fr.formation.smellyspring.dtos.SmellyUserOutDto;

public interface SmellyUserService {

    SmellyUserOutDto getSmellyUserOutDto();

    SmellyUserOutDto create(SmellyUserInDto dto); // Remove redundant @Valid with Controller
}
