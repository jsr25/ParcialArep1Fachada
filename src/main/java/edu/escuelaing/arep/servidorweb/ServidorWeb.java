package edu.escuelaing.arep.servidorweb;

import com.google.gson.Gson;
import edu.escuelaing.arep.calculator.connection.CalculatorConn;

import static spark.Spark.*;
public class ServidorWeb {

    public static void main(String[] args) {
        port(getPort());
        get("/",(req,res)-> {
            return "<!DOCTYPE html>" +
                    "<html>" +
                    "<head>" +
                    "<title> Calculadora</title>" +
                    "</head>" +
                    "<body>" +
                    "<div>" +
                    "<h2>Calculadora de funciones trigonometricas </h2>" +
                    "</div>" +
                    "<form action=\"/respuesta\" method=\"get\">" +
                    "<div>" +
                    " <h4 for\"info\">Ingrese numero a transformar</h4>" +
                    " <input required name=\"datos\" id=\"datos\" value=\"\">" +
                    "</div>" +
                    "<div>" +
                    " <h4 for\"info\">Ingrese Operacion</h4>" +
                    "<p> Se sugiere usar cos - sin - tan </p>"+
                    " <input required name=\"opera\" id=\"opera\" value=\"\">" +
                    "</div>" +
                    "</br>" +
                    "<button> Calcular </button>" +
                    "</form>" +
                    "</body>";
                });

        get("/respuesta",(req,res)-> {
            String datos=req.queryParams("datos");
            String opera=req.queryParams("opera");
            CalculatorConn calConn= new CalculatorConn();
            return new Gson().toJson(calConn.getResult(datos,opera));
        });
    }



    private static int getPort() {
        if(System.getenv("PORT")!= null){
            return  Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
