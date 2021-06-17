package com.codegym;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Palindrome();

    }
    public static void Palindrome() {
        boolean test = true;
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter add: ");
        String index = scanner.nextLine();
        index = index.toLowerCase();

        String[] check = index.split("");
        for (String s : check) {
            stack.push(s);
            queue.add(s);
        }
        while (!queue.isEmpty()) {
            if (queue.remove().equals(stack.pop())) {
                continue;
            } else {
                test = false;
                break;
            }
        }
        if (!test) {
            System.out.println("không phải chuỗi palindrome");
        } else {
            System.out.printf("chuỗi palindrome");
        }
    }

}
