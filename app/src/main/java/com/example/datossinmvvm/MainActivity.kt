package com.example.datossinmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.datossinmvvm.ui.theme.DatosSinMVVMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Permitir edge-to-edge rendering
        setContent {
            DatosSinMVVMTheme {
                // Usar Scaffold para el diseño
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Mostrar la pantalla de usuarios (ScreenUser)
                    ScreenUser(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
