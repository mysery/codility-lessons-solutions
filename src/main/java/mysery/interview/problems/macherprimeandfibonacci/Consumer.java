/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.macherprimeandfibonacci;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mysery
 */
public class Consumer implements Callable<Integer> {

    private final BlockingQueue<Integer> queue02;
    private final BlockingQueue<Integer> queue01;

    public Consumer(BlockingQueue<Integer> queue1, BlockingQueue<Integer> queue2) {
        this.queue01 = queue1;
        this.queue02 = queue2;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Consumer iniciado");
        while (true) {
            try {
                Integer number01 = queue01.take();
                //System.out.println("extrae de cola1 " + number01);
                //Integer number02 = queue02.take(); No coincide cantidad de elementos entonces hay que esperar.
                //System.out.println("extrae de cola2 " + number02);
                if (queue02.contains(number01)) {
                    System.out.println("SE ENCONTRO COINCIDENCIA " + number01);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
