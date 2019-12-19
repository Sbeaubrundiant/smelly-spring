package fr.formation.smellyspring.services;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

//Rename class from SmellyDateTmeProviderServiceImpl to SmellyDateTimeProviderServiceImpl
@Service
public class SmellyDateTimeProviderServiceImpl implements SmellyDateProviderService {

    @Override
    public LocalDate getLocalDate() {
	// Expects UnsupportedOperationException in Controller, not
	// IllegalArgumentException
	throw new UnsupportedOperationException("well, not supported!");
    }

    @Override
    public LocalDateTime getLocalDateTime() {
	return LocalDateTime.now();
    }
}
