
// In Java, a String is an immutable object, which means that once a String object is created, its value cannot be changed. This immutability has several advantages, including:

// Security: Strings are often used to store sensitive information, such as passwords and usernames. If Strings were mutable, it would be possible to change the value of a String object without the knowledge of the program that created it. This could lead to security vulnerabilities.

// Performance: Immutability makes Strings thread-safe, which means that they can be safely accessed and modified by multiple threads without the need for synchronization. This can improve the performance of multithreaded applications.

// Memory efficiency: The Java Virtual Machine (JVM) maintains a String pool, which is a repository of String objects that have been created in the program. When a new String object is created, the JVM checks the String pool to see if an existing String object with the same value already exists. If it does, the JVM reuses the existing String object instead of creating a new one. This can save memory, especially in programs that create a lot of Strings.

// Example of immutable String

class sol_1 {
  public static void main(String[] args) {
    String str = "Hello, World!";
    str = str + " Welcome to Java!";
    System.out.println(str);
  }
}

