package com.desenvolvedor.demo.teste;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class testandoBancoDados {
        public static void main(String[] args) {
            String url ="jdbc:postgresql://localhost:5432/db_usuario"; // Substitua
            String usuario ="db_usuario"; // Substitua
            String senha ="1234"; // Substitua

            try {
                Connection conexao = DriverManager.getConnection(url, usuario, senha);
                System.out.println("Conexão bem-sucedida!");
                conexao.close();
            } catch (SQLException e) {
                System.err.println("Erro ao conectar ao banco de dados:");
                e.printStackTrace();
            }
        }
    }

