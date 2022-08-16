package de.syntaxinstitut.ferienwohnungfinder.db

import android.nfc.Tag
import android.util.Log
import androidx.lifecycle.LiveData
import de.syntaxinstitut.ferienwohnungfinder.data.dataclasses.AppartmentData
import de.syntaxinstitut.ferienwohnungfinder.data.exampleData.AppartmentsExampleData
import java.lang.Exception

const val TAG = "Repository"

class Repository(private val database: AppartmentDatabase) {

    /* -------------------- Öffentliche Funktionen -------------------- */

    /**
     * Liefert alle Items aus der Tabelle
     *
     * @return Alle Items der Tabelle
     */
    // todo: getAllItems(), schreibe hier eine Funktion, welche alle Datensätze zurück liefert
    suspend fun getAllItems(): List<AppartmentData> = database.appartmentDao.getAllItems()


    /**
     * Anzahl der Items in der Tabelle zählen
     *
     * @return Anzahl der Items der Tabelle
     */
    // todo: getCount(), schreibe hier eine Funktion, welche die Anzahl der Datensätze zurück liefert
    suspend fun getCount() = database.appartmentDao.getCount()

    /**
     * Funktion um Beispielwerte und Daten von der API bei leerer Datenbank in diese einzufügen
     */
    suspend fun prepopulateDB() {
        // todo: Schreibe eine Funktion prepopulateDB() welche die Datenbank mit den
        //  Beispieldatensätzen befüllt, wenn diese leer ist
        if (database.appartmentDao.getCount() == 0) {
                try {
                    database.appartmentDao.insertItem(AppartmentsExampleData.appartment1)
                    database.appartmentDao.insertItem(AppartmentsExampleData.appartment2)
                    database.appartmentDao.insertItem(AppartmentsExampleData.appartment3)
                    database.appartmentDao.insertItem(AppartmentsExampleData.appartment4)
                    database.appartmentDao.insertItem(AppartmentsExampleData.appartment5)
                    database.appartmentDao.insertItem(AppartmentsExampleData.appartment6)
                } catch (e: Exception) {
                    Log.e(TAG, "Error fetching DB!")

                }
        }
    }
}

