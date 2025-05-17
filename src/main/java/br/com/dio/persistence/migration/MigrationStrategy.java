package br.com.dio.persistence.migration;

import lombok.AllArgsConstructor;

import java.sql.Connection;

@AllArgsConstructor
public class MigrationStrategy {

    private final Connection connection;

    private void executeMigration(){

    }
}
