package ug.co.absa.africa.digital.gateway.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import ug.co.absa.africa.digital.gateway.domain.Authority;

/**
 * Spring Data R2DBC repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends R2dbcRepository<Authority, String> {}
