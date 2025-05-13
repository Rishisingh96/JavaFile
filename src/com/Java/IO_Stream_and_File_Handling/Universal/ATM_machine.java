package com.Java.IO_Stream_and_File_Handling.Universal;
class LesException extends Throwable{

}

class ATM{
    static int TotalBalance = 5000;
    static void Withdrowl_money(int With) throws LesException{
        if(TotalBalance>With){
            System.out.println(" Your Withdrowl success_full........... ");
        }
        else {
            throw new LesException();
        }
    }
    static void Deposit_money(int depo) {

    }
}

public class ATM_machine {

    public static void main(String[] args) {
    //    ATM.Withdrowl_money(5000);
        ATM.Deposit_money(3000);
    }

}
