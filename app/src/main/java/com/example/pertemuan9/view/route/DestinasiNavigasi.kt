package com.example.pertemuan9.view.route

interface DestinasiNavigasi {
    /**
     * nama unik untuk menentukan jalur untuk composable
     */
    val route: String
    /**
     *string resource id yang berisi judul
     * yang akan ditampilkan di layar halaman
     */
    val titleRes: Int
}
