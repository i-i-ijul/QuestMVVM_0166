package com.example.projectakhir.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(
    pilihanJK: List<String>,
    onSubmitBtnClicked: (MutableList<String>) -> Unit
modifier: Modifier = Modifier)
){
    var txtNama by rememberSaveable { mutableStateOf("")}

}
