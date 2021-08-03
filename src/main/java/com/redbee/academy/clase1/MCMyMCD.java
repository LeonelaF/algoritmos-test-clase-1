package com.redbee.academy.clase1;

public class MCMyMCD {


    /**
     * Generar un algoritmo que resuelva el mínimo común múltiplo entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcm(int num1, int num2) { //num1=6, num2=9
        if (num2>num1){
            Integer aux=num1;
            num1=num2;
            num2=aux;
        }
        Integer val=num1;
        while(val%num1!=0||val%num2!=0){ //9%9=0, 9%6=3; 10%9=1 10%6=4...
            val++;
        }
        return val;
    }

    /**
     * Generar un algoritmo que resuelva el máximo común divisor entre 2 números
     *
     * @param num1
     * @param num2
     * @return
     */
    public static Integer mcd(int num1, int num2) {
        if (num2<num1){
            Integer aux=num1;
            num1=num2;
            num2=aux;
        }
        Integer val=num1;
        while(num1%val!=0||num2%val!=0){
            val--;
        }
        return val;
    }
}
