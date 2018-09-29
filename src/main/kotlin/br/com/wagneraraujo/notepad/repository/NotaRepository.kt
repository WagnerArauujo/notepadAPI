package br.com.wagneraraujo.notepad.repository

import br.com.wagneraraujo.notepad.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository : MongoRepository<Nota, String> {

fun findByTituloContainIgnoreCase(titulo: String): List<Nota>

}