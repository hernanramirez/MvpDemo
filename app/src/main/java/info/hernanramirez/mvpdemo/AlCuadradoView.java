package info.hernanramirez.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AlCuadradoView extends AppCompatActivity implements IAlCuadrado.View {

    private TextView txtAlCuadrado;
    private EditText edAlCuadrado;

    private AlCuadradoPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAlCuadrado = (TextView) findViewById(R.id.txtAlCuadrado);
        edAlCuadrado = (EditText) findViewById(R.id.edAlCuadrado);
        presenter = new AlCuadradoPresenter(this);
    }

    public void calcular(View view){
        presenter.alCuadrado(edAlCuadrado.getText().toString());
    }

    @Override
    public void mostrarResultado(String resultado) {
        txtAlCuadrado.setText(resultado);
    }
}
