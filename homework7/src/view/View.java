package view;

import model.ComplexNumber;

public class View {
    public void print(ComplexNumber complexNumber){
        if (complexNumber.getImaginary() < 0){
            System.out.println(complexNumber.getReal() + " " + complexNumber.getImaginary() + "i");
        } else {
            System.out.println(complexNumber.getReal() + " + " + complexNumber.getImaginary() + "i");
        }

    }
}
