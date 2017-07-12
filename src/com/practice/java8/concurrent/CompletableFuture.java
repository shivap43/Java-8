package com.practice.java8.concurrent;

import java.util.concurrent.ExecutionException;
/**
 * 
 * @author Shiv
 *
 */
public class CompletableFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        java.util.concurrent.CompletableFuture<String> future = new java.util.concurrent.CompletableFuture<>();

        future.complete("42");

        future
                .thenAccept(System.out::println)
                .thenAccept(v -> System.out.println("done"));

    }

}
