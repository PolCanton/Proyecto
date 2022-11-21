package car.copernic.pcanton.proyecto.Registrar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import car.copernic.pcanton.proyecto.R
import car.copernic.pcanton.proyecto.databinding.ActivityIniciarSessionBinding
import car.copernic.pcanton.proyecto.databinding.ActivityRegistrarBinding

class Registrar : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}