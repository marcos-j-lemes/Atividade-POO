

class Contador{

    private int valueContador;
    private int oldValueContador;
    private final int numberCount;

    Contador (int valueContador, int numberCount){
        this.valueContador = valueContador;
        this.numberCount = numberCount;
        this.oldValueContador = valueContador;
    }

    public void setValueContador(int value){
        valueContador += value;
        oldValueContador = valueContador;
    }

    public void getValues(){
        System.out.println("Contador: "+ valueContador+ "\nOldValue: "+ oldValueContador);
      //  return valueContador;
    }

    public void showInfo(){
        System.out.println("the counter is at "+ valueContador + "| Number count: "+ numberCount);
    }

    public void backValue(){
        valueContador = oldValueContador;
    }

    public void resetValue(){
        valueContador = 0;
    }
}

public class MainContador {

    public static void main(String[] args){

        Contador c1 = new Contador(10, 1);
        c1.showInfo();
        c1.resetValue();
        c1.showInfo();
        c1.backValue();
        c1.showInfo();

        c1.setValueContador(5);
        c1.resetValue();
        c1.backValue();
        c1.showInfo();

        c1.setValueContador(40);
        c1.resetValue();
        c1.getValues();
    }
}
