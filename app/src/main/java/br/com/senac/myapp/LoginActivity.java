package br.com.senac.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtEmail, edtSenha;
    Button btnLogin;
    TextView txtPasswordRecovery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //apresentando as variaveis xml no java

        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);
        btnLogin = findViewById(R.id.btnLogin);
        txtPasswordRecovery = findViewById(R.id.txtPasswordRecovery);

        //criando o clique do botão
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //Pegando valores do email e senha do usuário
            String email, password;

            email = edtEmail.getText().toString();
            password = edtSenha.getText().toString();

            // criando a estrutura de decisão para acesso o sistema
                if (true){
                    //Entrar aqui
                }
            }
        });

        txtPasswordRecovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void abrirFacebook(View view) {
        Toast.makeText(getApplicationContext(),
                "Cliquei no botão do Facebook!!",
                Toast.LENGTH_SHORT).show();
    }
}