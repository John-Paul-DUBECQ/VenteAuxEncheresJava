package Model;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Chronometre extends TimerTask{

    private long dureeVente=5000; // En millisecondes soit 20 secondes
    private long finChrono;
    private long tempsRestant=0;
    private String tempsRestantString;

    public static Chronometre instance;

    public static synchronized Chronometre getInstance(){
        if(instance==null){
            instance = new Chronometre();
        }
        return instance;
    }

    public Chronometre() {
        super();
        long maintenant=Calendar.getInstance().getTimeInMillis();
        this.finChrono=maintenant+dureeVente;
        this.tempsRestant=this.dureeVente;
    }

    @Override
    public void run() {
        /*
         * Cette fonction est appelée par le Timer. Ici, elle s'exécute toutes les secondes - voir le main
         */

        // Arrêt du chrono lorsque le temps est écoulé
        long maintenant = Calendar.getInstance().getTimeInMillis();
        tempsRestant = finChrono - maintenant;
        if (tempsRestant<=0)
        {
            System.out.println("Temps écoulé");
            this.cancel();
        }
        else
        {
            // Transformation des millisecondes en string
            Duration reste =Duration.ofMillis(tempsRestant);
            tempsRestantString = String.format("%02d:%02d:%02d", reste.toHours(), reste.toMinutesPart(), reste.toSecondsPart());
            System.out.println(tempsRestantString);
        }

    }
    public static void main(String[] args) {

        Chronometre chronometre = new Chronometre();
        final Timer timer = new Timer();
        //Programmation du chronomètre
        // la fonction run du chronomètre s'exécute toutes les secondes
        timer.scheduleAtFixedRate(chronometre, 0, 1000);
    }
}
