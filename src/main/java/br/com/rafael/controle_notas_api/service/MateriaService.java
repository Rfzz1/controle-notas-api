package br.com.rafael.controle_notas_api.service;

import br.com.rafael.controle_notas_api.dto.MateriaDTO;
import br.com.rafael.controle_notas_api.model.Materia;
import br.com.rafael.controle_notas_api.repository.MateriaRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class MateriaService {

    private final MateriaRepository repository;

    public MateriaService(MateriaRepository repository) {
        this.repository = repository;
    }

    // 🔹 LISTAR TODAS AS MATÉRIAS
    public List<MateriaDTO> listarMaterias() {
        return repository.findAll()
                .stream()
                .map(m -> new MateriaDTO(
                        m.getId(),
                        m.getMateria()
                ))
                .collect(Collectors.toList());
    }
}
