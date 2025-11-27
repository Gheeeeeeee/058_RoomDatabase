package com.example.pertemuan9.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.pertemuan9.repositori.RepositoriSiswa

class EntryViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
    private set
}