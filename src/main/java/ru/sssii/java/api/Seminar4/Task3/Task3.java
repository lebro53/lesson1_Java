package ru.sssii.java.api.Seminar4.Task3;

class Solution {
    //    public static String simplifyPath(String path) {
//        Stack<String> stack = new Stack();
//        StringJoiner res = new StringJoiner("/");
//        String[] subPath = path.split("/");
//        for (String s : subPath) {
//            if ("..".equals(s)) {
//                if (!stack.isEmpty()) {
//                    stack.pop();
//                }
//            } else if (!".".equals(s) && !s.isEmpty()) {
//                stack.push(s);
//            }
//        }
//        if (stack.isEmpty()) return "/";
//        while (!stack.isEmpty()) {
//            res.add(stack.pop());
//        }
//        return "/" + res;
    public static void main(String[] args) {
//        System.out.println("simplifyPath() = " + simplifyPath("/home/"));
//        System.out.println("simplifyPath() = " + simplifyPath("/../"));
//        System.out.println("simplifyPath() = " + simplifyPath("/home//foo/"));

    }

//    public static String simplifyPath(String path) {
//        Stack<String> stack = new Stack();
//        StringBuilder res = new StringBuilder();
//        String[] subPath = path.split("/");
//        for (String s : subPath) {
//            if ("..".equals(s)) {
//                if (!stack.isEmpty()) {
//                    stack.pop();
//                }
//            } else if (!".".equals(s) && !s.isEmpty()) {
//                stack.push(s);
//            }
//        }
//        if (stack.isEmpty()) return "/";
//        while (!stack.isEmpty()) {
//            res.append("/");
//            res.append(stack.pop());
//        }
//        return res.toString();
    }

    /**
     * Stack<String> stack = new Stack();
     *         StringBuilder res = new StringBuilder();
     *         String[] subPath = path.split("/");
     *         for (String s : subPath) {
     *             if ("..".equals(s)) {
     *                 if (!stack.isEmpty()) {
     *                     stack.pop();
     *                 }
     *             } else if (!".".equals(s) && !s.isEmpty()) {
     *                 stack.push(s);
     *             }
     *         }
     *         if (stack.isEmpty()) return "/";
     *         while (!stack.isEmpty()) {
     *             res.insert(0,stack.pop()).insert(0,"/");
     *         }
     *         return res.toString();
     *     }
     */
