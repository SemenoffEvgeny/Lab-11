package MyPackage;

public class B extends A {
//    Метод видит родительское protected поле
    public int get_protected_a() {
        return this.a_protected;
    }

//    Метод видит родительское public поле
    public int get_public_a() {
        return this.a_public;
    }
//    А вот приватное поле не увидит
//    public int get_private_a() {
//        return this.a_private;
//    }
}
