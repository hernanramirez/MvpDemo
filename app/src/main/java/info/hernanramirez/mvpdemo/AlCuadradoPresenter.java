package info.hernanramirez.mvpdemo;

public class AlCuadradoPresenter implements IAlCuadrado.Presenter {

    private IAlCuadrado.View view;
    private IAlCuadrado.Model model;
    private double resultado;

    public AlCuadradoPresenter(IAlCuadrado.View view) {
        this.view = view;
        model = new AlCuadradoModel(this);
    }

    @Override
    public void mostrarResultado(String resultado) {

        if(view != null){
            view.mostrarResultado(resultado);
        }

    }

    @Override
    public void alCuadrado(String data) {

        if(view != null){
            model.alCuadrado(data);
        }

    }
}
