/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.macherprimeandfibonacci;

import java.util.Queue;
import java.util.concurrent.Callable;

/**
 *
 * @author mysery
 */
public class Producer implements Callable<Integer> {

    private final Generator generator;
    private final Queue<Integer> queue;
    private final Integer limit;
    private Integer actual;

    public Producer(Generator generator, Queue<Integer> queue, Integer limit) {
        this.generator = generator;
        this.queue = queue;
        this.actual = 0;
        this.limit = limit;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Producer iniciado");
        while (actual < limit) {
            actual = generator.next();
            //System.out.println("Producer genera "+actual);
            queue.add(actual);
        }
        System.out.println("Producer finalizado");
        return null;
    }

}
