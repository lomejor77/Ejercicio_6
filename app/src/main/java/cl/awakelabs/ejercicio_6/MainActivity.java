package cl.awakelabs.ejercicio_6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textName;
        EditText textFirstName;
        EditText textEmail;
        EditText textPass;

        textName = findViewById(R.id.textName);
        textFirstName = findViewById(R.id.textFirstName);
        textEmail = findViewById(R.id.textEmail);
        textPass = findViewById(R.id.textPass);

        Button btnCreate = findViewById(R.id.btnCreate);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = textName.getText().toString();
                String lastName = textFirstName.getText().toString();
                String email = textEmail.getText().toString();
                String pass = textPass.getText().toString();
                if(name.isEmpty() || lastName.isEmpty() || email.isEmpty() || pass.isEmpty() || !email.contains("@")){
                    Toast.makeText(getBaseContext(), "No puede haber campos vacios", Toast.LENGTH_SHORT).show();
                    return;

                }

                String texto = "Usuario " + name + lastName + "Email: " + email + "Contraseña: " + pass;


            }
        });
    }
}