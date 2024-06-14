package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
@RequestMapping("/test")
public class TesteController {

    @Autowired
    private DataSource dataSource;

    @SuppressWarnings("unused")
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/db")
    public String testDbConnection() {
        try (Connection connection = dataSource.getConnection()) {
            if (connection != null) {
                return "Conexão com o banco de dados estabelecida com sucesso!";
            } else {
                return "Falha ao conectar ao banco de dados.";
            }
        } catch (SQLException e) {
            return "Erro ao conectar ao banco de dados: " + e.getMessage();
        }
    }

    @GetMapping("/ping")
    public String ping() {
        return "Pong! A aplicação está ativa.";
    }
}
