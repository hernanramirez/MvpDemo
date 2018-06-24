package info.hernanramirez.mvpdemo;

public interface IAlCuadrado {

    interface View{
        void mostrarResultado(String resultado);
    }

    interface Presenter {
        void mostrarResultado(String resultado);
        void alCuadrado(String data);
    }

    interface Model {
        void alCuadrado(String data);
    }

}
