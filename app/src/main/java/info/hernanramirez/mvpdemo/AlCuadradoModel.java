package info.hernanramirez.mvpdemo;

public class AlCuadradoModel implements IAlCuadrado.Model {

    private AlCuadradoPresenter presenter;
    private Double resultado;

    public AlCuadradoModel(AlCuadradoPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void alCuadrado(String data) {

        if (data.equals("") || !android.text.TextUtils.isDigitsOnly(data)){
           presenter.mostrarResultado("Data debe ser un numero");
        }else {
            resultado = Double.valueOf(data) * Double.valueOf(data);
            presenter.mostrarResultado(String.valueOf(resultado));
        }
    }
}
