package Exercises.E5_D3;

import Exercises.E5_D3.entities.Ordine;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CLRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(E5D3Application.class);
        System.out.println(ctx.getBean("fullMenu"));
        Ordine o1 = (Ordine) ctx.getBean("getExampleOrder");
        System.out.println(o1);
        System.out.println(o1.getTotale());
    }
}
