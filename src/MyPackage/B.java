package MyPackage;

public class B extends A {

//    Метод видит родительское protected поле
    public void get_protected_a() {
        System.out.println(this.a_protected);
    }

//    Метод видит родительское public поле
    public void get_public_a() {
        System.out.println(this.a_public);
    }

//    А вот приватное поле не увидит
//    public String get_private_a() {
//        return this.a_private;
//    }

}
