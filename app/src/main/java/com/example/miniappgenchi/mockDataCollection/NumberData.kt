package com.example.miniappgenchi.mockDataCollection

import com.example.miniappgenchi.dataClassCollection.Numbers

class NumberData {
    fun getNumberData():List<Numbers>{
        val numberList = listOf(
            Numbers("ichi","One","いち"),
            Numbers("ni", "Two","に"),
            Numbers("san", "Three","さん"),
            Numbers("shi / yon", "Four","し / よん"),
            Numbers("go", "Five","ご"),
            Numbers("roku", "Six","ろく"),
            Numbers("shichi / nana", "Seven","しち / なな"),
            Numbers("hachi", "Eight","はち"),
            Numbers("ku / kyuu", "Nine","く / きゅう"),
            Numbers("juu", "Ten","じゅう")
        )

        return numberList
    }
}