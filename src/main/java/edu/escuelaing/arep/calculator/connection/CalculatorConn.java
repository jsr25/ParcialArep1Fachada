package edu.escuelaing.arep.calculator.connection;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Autor Juan Ramos
 *
 * Conexion con el Api de la calculadora
 *
 */
public class CalculatorConn {

    public String getResult(String valor, String opera){
        Request req = new Request.Builder()
                .url("https://parcial1arepapi.herokuapp.com/calc?valor="+valor+"&opera="+opera)
                .get()
                .build();
        OkHttpClient httpClient = new OkHttpClient();
        String respuesta= "";
        Response res= null;

        try {
            res = httpClient.newCall(req).execute();
            if(res.isSuccessful()){
                respuesta = res.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return respuesta;
    }

}
