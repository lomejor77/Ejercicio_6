package cl.awakelabs.ejercicio_6;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import cl.awakelabs.ejercicio_6.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());


        binding.btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = binding.textName.getText().toString();
                String lastName = binding.textFirstName.getText().toString();
                String email = binding.textEmail.getText().toString();
                String pass = binding.textPass.getText().toString();
                if(name.isEmpty() || lastName.isEmpty() || email.isEmpty() || pass.isEmpty() || !email.contains("@")){
                    Toast.makeText(getBaseContext(), "No puede haber campos vacios", Toast.LENGTH_SHORT).show();
                    return;

                }

                String texto = "Usuario " + name + lastName + "Email: " + email + "Contraseña: " + pass;


            }
        });
    }
}