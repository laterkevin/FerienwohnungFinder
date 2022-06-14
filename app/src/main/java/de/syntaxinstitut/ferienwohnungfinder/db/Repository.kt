package de.syntaxinstitut.ferienwohnungfinder.db

import android.content.Context
import android.util.Log
import de.syntaxinstitut.ferienwohnungfinder.data.dataclasses.AppartmentData
import de.syntaxinstitut.ferienwohnungfinder.data.exampleData.AppartmentsExampleData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Repository(private val database: AppartmentDatabase) {

    /* -------------------- Objekte -------------------- */

    /**
     * Companion Object, welches innerhalb der Klasse definiert wird und Zugriff auf private Elemente der Klasse hat
     */
    companion object {
        private var repository: Repository? = null

        /**
         * Funktion um eine Instanz des Repositories zu erhalten
         *
         * @param	context		Der Context des aufrufenden ViewModels
         */
        fun getInstance(context: Context): Repository =
            repository ?: buildRepo(
                AppartmentDatabase.getInstance(context.applicationContext)
            ).also {
                repository = it
            }

        /**
         * Lokale Funktion um ein Repository zu erstellen
         *
         * @param shoppingListDatabase    Die Datenbank mit der das Repo verknüpft werden soll
         *
         * @return Ein Repository
         */
        private fun buildRepo(shoppingListDatabase: AppartmentDatabase): Repository =
            Repository(shoppingListDatabase)
    }


    /* -------------------- Öffentliche Funktionen -------------------- */

    /**
     * Liefert alle Items aus der Tabelle
     *
     * @return Alle Items der Tabelle
     */
    // todo: getAllItems(), schreibe hier eine Funktion, welche alle Datensätze zurück liefert

    /**
     * Anzahl der Items in der Tabelle zählen
     *
     * @return Anzahl der Items der Tabelle
     */
    // todo: getCount(), schreibe hier eine Funktion, welche die Anzahl der Datensätze zurück liefert

    /**
     * Funktion um Beispielwerte und Daten von der API bei leerer Datenbank in diese einzufügen
     */
    fun prepopulateDB() {
        // todo: Schreibe eine Funktion prepopulateDB() welche die Datenbank mit den
        //  Beispieldatensätzen befüllt, wenn diese leer ist
    }
}