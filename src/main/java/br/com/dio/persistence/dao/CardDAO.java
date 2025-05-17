package br.com.dio.persistence.dao;

import br.com.dio.dto.CardDetailsDTO;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

@AllArgsConstructor
public class CardDAO {

    private Connection connection;

    public Optional<CardDetailsDTO> findById(final Long id) throws SQLException {
        return null;
    }
}
