package br.com.rafael.controle_notas_api.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static String hash(String senha) {
        return encoder.encode(senha);
    }

    public static boolean verificar(String senhaDigitada, String hashSalvo) {
        return encoder.matches(senhaDigitada, hashSalvo);
    }
}
