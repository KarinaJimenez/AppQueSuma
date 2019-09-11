package jimenez.karina.appquesuma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText etNum1,etNum2;
    Button btnSumar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        btnSumar = findViewById(R.id.btnSumar);


        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.valueOf(etNum1.getText().toString());
                int num2 = Integer.valueOf(etNum2.getText().toString());
                int resultado = num1 + num2;
                mensajito("El resultado es: "+resultado);
            }
        });


    }
    public void mensajito(String mensaje){
        Toast.makeText( this, mensaje, Toast.LENGTH_LONG).show();
    }
}
