package ru.synergy.roomdemonotesapp.notedb.dao;



import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import ru.synergy.roomdemonotesapp.notedb.model.Note;
import ru.synergy.roomdemonotesapp.util.Constants;

@Dao
public interface NoteDao {

    @Query("SELECT * FROM " + Constants.TABLE_NAME_NOTE)
    List<Note> getNotes();

    /* Insert the object in database
     *  @param note, object to be inserted
     */

    @Insert
    long insertNote(Note note);

    /* Update the object in database
     * @param note, object to be updated
     */

    @Update
    void updateNote(Note repos);

    /* Delete the object in database
     * @param note, object to be deleted
    * */

    @Delete
    void deleteNote(Note note);

    // Note... is varargs, here note is an array
    /* Delete list of object from database
     * @param note, array of object to be deleted
     */

    @Delete
    void deleteNotes(Note... note);

}
