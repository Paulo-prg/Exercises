import java.util.ArrayList;
import java.util.List;

public abstract class main {

    public class NewMain {

   
        /**
         * @param args
         */
        public void main(String[] args) {
           
            String nome;
        double duracao;
    
        final NewMain nome, final double duracao) {
            this.nome = nome;
            this.duracao = duracao;
        }
    
        public String toString() {
            return nome + duracao;
        }
    }
    
    public class Do extends Nota {
        public Do(double duracao) {
            super("C", duracao);
        }
    }
    
    public class Re extends Nota {
        public Re(double duracao) {
            super("D", duracao);
        }
    }
    
    
    
    public class Sustenido extends Nota {
        public Sustenido(Nota nota) {
            super(nota.toString().replace("b", "#"), nota.duracao);
        }
    }
    
    public class Bemol extends Nota {
        public Bemol(Nota nota) {
            super(nota.toString().replace("#", "b"), nota.duracao);
        }
    }
        }
}


