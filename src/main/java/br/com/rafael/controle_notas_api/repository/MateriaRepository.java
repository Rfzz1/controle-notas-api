    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.rafael.controle_notas_api.repository;

import br.com.rafael.controle_notas_api.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Rafa
 */
public interface MateriaRepository extends JpaRepository<Materia, Long> {
    
}
