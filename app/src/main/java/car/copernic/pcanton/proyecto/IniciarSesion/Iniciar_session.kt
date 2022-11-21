package car.copernic.pcanton.proyecto.IniciarSesion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import car.copernic.pcanton.proyecto.R
import car.copernic.pcanton.proyecto.databinding.ActivityIniciarSessionBinding

class Iniciar_session : AppCompatActivity() {
    private lateinit var binding: ActivityIniciarSessionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIniciarSessionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}