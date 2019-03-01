package MySecondPackage;

import MyPackage.A;

public class MySecondPackageClass {

    public void index() {
        System.out.println("Вызов метода класса MySecondPackageClass");
        A a = new A();
//        Нельзя получить доступ
//        a.protected;
    }


}
