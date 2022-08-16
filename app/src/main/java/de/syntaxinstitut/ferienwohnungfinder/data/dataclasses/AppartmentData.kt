package de.syntaxinstitut.ferienwohnungfinder.data.dataclasses

import androidx.room.Entity
import androidx.room.PrimaryKey


// todo: Schreibe hier die Entity rein
@Entity(tableName = "appartment_table")
data class AppartmentData(
//    todo: primary key
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    var title: String,
    var address: String,
    var sleepRooms: Int,
    var size: Int,
    var persons: Int,
    var pricePerNight: Int,
    var image: Int,
    var petsAllowed: Boolean
)
