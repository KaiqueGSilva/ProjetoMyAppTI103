package br.com.senac.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //declarar as variáveis globais
    EditText edtEmail,edtSenha;
    Button btnLogin;
    TextView txtRecuperarSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //apresentando as variaveis xml no java

        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);
        btnLogin = findViewById(R.id.btnLogin);
        txtRecuperarSenha = findViewById(R.id.txtRecuperarSenha);

        //Criando o clique do botão

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Pegando os valores do email e senha do usúario
                String email, senha;

                email = edtEmail.getText().toString();
                senha = edtSenha.getText().toString();

                //criando a estrutura de decisão para acesso ao sistema
                if (email.equals("senac@sp.senac.br")&&senha.equals("senac")){
                    //entrar aqui..
                    Intent intent = new Intent(getApplicationContext(),
                            MenuPrincipalActivity.class);
                    //passar parâmetros para outras janelas
                    startActivity(intent);
                }
            }
        });

    }

    public void abrirFacebook(View view) {
        Toast.makeText(getApplicationContext(),
                "Cliquei no botão do Facebook",
                Toast.LENGTH_SHORT).show();
    }
}