package com.company.Skills;

/**
 * Package com.company.Skills
 * Created by trevor2076 on 6/2/16/Jun/2016}.
 * <p>
 * The following code may not be used without the explicit permission of trevor2076
 */
public class mathamatics {
    int finalNum;

    public int basicCalculate(int number,int secondNum,String method){


        if(method == "+"){
            finalNum = number + secondNum;
        }else if(method == "-"){
            finalNum = number - secondNum;
        }else if(method == "*"){
            finalNum = number * secondNum;
        }else if(method == "/"){
            finalNum = number / secondNum;
        }

      return finalNum;
    }

}
