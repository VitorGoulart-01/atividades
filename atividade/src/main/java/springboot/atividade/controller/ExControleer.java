package springboot.atividade.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/")
public class ExControleer {

    int resultado;


    @GetMapping("/api")
    public String home(){
        return "ola, aplicaçao Spring!";
    }

    @GetMapping("/api/teste/{numUm}/{numDois}")
    public int teste(@PathVariable int numUm, @PathVariable int numDois){

        int soma = numUm + numDois;
        return soma;

    }

    @GetMapping("/api/soma/{numU}/{numeroD}")
    public int soma(@PathVariable int numeroU, @PathVariable int numeroD){
        
        resultado = numeroU + numeroD;

        return resultado;

    }

    @GetMapping("/api/Subtrair/{numUm}/{numeroDois}")
    public int Subtrair(@PathVariable int numUm, @PathVariable int numDois ) {
        resultado = numUm - numDois;

        return resultado;

    }

    @GetMapping("/VerificarParouImpar")
    public String Verificar() {

        if(resultado % 2 == 0){

            return "E par";

        }else{
            return "e impar";
        }
    

        
    }
    
    



}
