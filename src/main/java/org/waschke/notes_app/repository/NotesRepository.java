package org.waschke.notes_app.repository;
import org.springframework.data.repository.CrudRepository;
import org.waschke.notes_app.entity.Notes;

public interface NotesRepository extends CrudRepository<Notes, Long> {

}
