package br.com.suleimanmoraes.gestaofesta.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.suleimanmoraes.gestaofesta.api.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
