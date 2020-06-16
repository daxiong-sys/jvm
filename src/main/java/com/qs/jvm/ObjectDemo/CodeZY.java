package com.qs.jvm.ObjectDemo;

class CodeZY {
    public CodeZY(){
        System.out.println("code的构造方法1111");
    }
    {
        System.out.println("code的构造块2222");
    }
    static {
        System.out.println("code的静态代码块3333");
    }
}

 class CodeBlock03{  // 主类
     {
         System.out.println("CodeBlock03的构造块4444");
     }
     static {
         System.out.println("CodeBlock03的静态代码块5555");
     }
     public CodeBlock03(){
         System.out.println("CodeBlock03的构造方法6666");
     }

     public static void main(String[] args) {
         System.out.println("=======CodeBlock03的main方法 777777=====");
         new CodeZY();
         System.out.println("----------");
         new CodeZY();
         System.out.println("- - ------------");
         new CodeBlock03();
     }
}
