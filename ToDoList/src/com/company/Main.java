package com.company;

import work.commands.Process;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Process process = new Process("todotask.xml");

        process.start();


    }

}
