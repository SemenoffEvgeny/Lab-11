import MyPackage.A;
import MySecondPackage.MySecondPackageClass;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Импорт кастомного пакета MyPackage");
        A a = new A();

        System.out.println("Импорт кастомного пакета MySecondPackage");
        MySecondPackageClass mspc = new MySecondPackageClass();

        mspc.index();
    }
}
