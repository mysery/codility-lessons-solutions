/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysery.interview.problems.macherprimeandfibonacci;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author mysery
 */
public class Main {

    public static void main(String[] args) {

        BlockingQueue primeQueue = new LinkedBlockingQueue(1000);
        BlockingQueue fibonacciQueue = new LinkedBlockingQueue(1000);
        Integer limit = 100000;
        Producer primeProducer = new Producer(new PrimeGenerator(), primeQueue, limit);
        Producer fiboProducer = new Producer(new FibonacciGenerator(), fibonacciQueue, limit);
        Consumer consumer = new Consumer(primeQueue, fibonacciQueue);
        
        ExecutorService exService = Executors.newFixedThreadPool(3);
        exService.submit(primeProducer);
        exService.submit(fiboProducer);
        exService.submit(consumer);
        exService.shutdown();
        while (!exService.isTerminated()){
            
        }
//        exService = Executors.newSingleThreadExecutor();
//        exService.shutdown();
        

    }
}
