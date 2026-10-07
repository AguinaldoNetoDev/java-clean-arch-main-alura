package br.com.alura.codechella.domain.entities.usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class UsuarioTest {

    @Test
    void naoDeveCadastrarUsuarioComCpfInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class,
            () -> new Usuario("123.456.789-000", "João", LocalDate.parse("1993-01-01"), "joao@example.com")
        );

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("12345678900", "João", LocalDate.parse("1993-01-01"), "joao@example.com")
        );
    }
}
