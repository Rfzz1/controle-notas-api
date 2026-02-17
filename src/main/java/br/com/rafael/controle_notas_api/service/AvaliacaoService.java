package br.com.rafael.controle_notas_api.service;


import br.com.rafael.controle_notas_api.dto.AvaliacaoCreateDTO;
import br.com.rafael.controle_notas_api.dto.AvaliacaoDTO;
import br.com.rafael.controle_notas_api.dto.AvaliacaoResponseDTO;
import br.com.rafael.controle_notas_api.dto.NotaFinalDTO;
import br.com.rafael.controle_notas_api.model.*;
import br.com.rafael.controle_notas_api.repository.*;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class AvaliacaoService {

    private final AvaliacaoRepository repository;
    private final AlunoRepository alunoRepository;
    private final MateriaRepository materiaRepository;
    private final TipoAvaliacaoRepository tipoRepository;

    public AvaliacaoService(
        AvaliacaoRepository repository,
        AlunoRepository alunoRepository,
        MateriaRepository materiaRepository,
        TipoAvaliacaoRepository tipoRepository
    ) {
        this.repository = repository;
        this.alunoRepository = alunoRepository;
        this.materiaRepository = materiaRepository;
        this.tipoRepository = tipoRepository;
    }

    public AvaliacaoDTO criar(AvaliacaoCreateDTO dto) {

        Aluno aluno = alunoRepository.findById(dto.getAlunoId())
                .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        Materia materia = materiaRepository.findById(dto.getMateriaId())
                .orElseThrow(() -> new RuntimeException("Matéria não encontrada"));

        TipoAvaliacao tipo = tipoRepository.findById(dto.getTipoId())
                .orElseThrow(() -> new RuntimeException("Tipo não encontrado"));

        Avaliacao a = new Avaliacao();
        a.setAluno(aluno);
        a.setMateria(materia);
        a.setTipo(tipo);
        a.setTrimestre(dto.getTrimestre());
        a.setTitulo(dto.getTitulo());
        a.setDescricao(dto.getDescricao());
        a.setValorMax(dto.getValorMax());
        a.setNota(dto.getNota());
        a.setData(dto.getData());

        Avaliacao salva = repository.save(a);
        return new AvaliacaoDTO(salva);
    }

    
    public List<NotaFinalDTO> boletimFinal(Long alunoId, Integer trimestre) {
        return repository.buscarNotasFinais(alunoId, trimestre);
    }
   
    
    public void deletar(Long id) {
        repository.deleteById(id);
    }
    
    public AvaliacaoDTO atualizar(Long id, AvaliacaoCreateDTO dto) {

    Avaliacao avaliacao = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Avaliação não encontrada"));
    
    Aluno aluno = alunoRepository.findById(dto.getAlunoId())
            .orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    
    Materia materia = materiaRepository.findById(dto.getMateriaId())
            .orElseThrow(() -> new RuntimeException("Matéria não encontrada"));
    
    TipoAvaliacao tipo = tipoRepository.findById(dto.getTipoId())
            .orElseThrow(() -> new RuntimeException("Tipo não encontrado"));
    
    avaliacao.setAluno(aluno);
    avaliacao.setMateria(materia);
    avaliacao.setTipo(tipo);
    avaliacao.setTrimestre(dto.getTrimestre());
   
    avaliacao.setTitulo(dto.getTitulo());
    avaliacao.setDescricao(dto.getDescricao());
    avaliacao.setNota(dto.getNota());
    avaliacao.setValorMax(dto.getValorMax());
    avaliacao.setData(dto.getData());

    repository.save(avaliacao);

    return new AvaliacaoDTO(avaliacao);
   
}
        public List<AvaliacaoResponseDTO>listarPorAlunoETrimestre(Long alunoId, Integer trimestre) {
        List<Avaliacao> lista = repository.findByAlunoIdAndTrimestre(alunoId, trimestre);
        
        return lista.stream().map(a -> {
            AvaliacaoResponseDTO dto = new AvaliacaoResponseDTO();
            dto.setId(a.getId());
            dto.setAlunoId(a.getAluno().getId());
            dto.setMateriaId(a.getMateria().getId());
            dto.setMateriaNome(a.getMateria().getMateria());
            dto.setTipoId(a.getTipo() !=null ? a.getTipo().getId() : null);
            dto.setTitulo(a.getTitulo());
            dto.setDescricao(a.getDescricao());
            dto.setValorMax(a.getValorMax());
            dto.setNota(a.getNota());
            dto.setData(a.getData());
            dto.setTrimestre(a.getTrimestre());
            dto.setTipoNome(a.getTipo() !=null ? a.getTipo().getAvaliacao() : null);
            return dto;
        }).toList();
    }
}
