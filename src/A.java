 class A {
    void msg(){
        System.out.println("Hello");
    }

}
class B{
    void msg(){
        System.out.println("Welcome");
    }
}
class C extends B{
    public static void main(String[] args) {
        C obj = new C();
        obj.msg();
    }
}