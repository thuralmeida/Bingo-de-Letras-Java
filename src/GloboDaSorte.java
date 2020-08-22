
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARTHUR
 */
public class GloboDaSorte {
ArrayList<Integer> numeros = new ArrayList<>(26);
    
    public GloboDaSorte(int de, int ate) {
            for (int numero = de; numero <= ate; numero++) {
                numeros.add(numero);
            }            
        }
                
    public int sortear() {
        if (numeros.isEmpty()) {
            throw new IllegalStateException("Todos os números já foram sorteados!");
        }
        Random random = new Random();
        int sorteado = random.nextInt(numeros.size());
        return numeros.remove(sorteado);
    }
}
