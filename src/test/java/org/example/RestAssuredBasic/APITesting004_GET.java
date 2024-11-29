package org.example.RestAssuredBasic;

public class APITesting004_GET {
    public void step1(){
        System.out.println("Step 1");
    }

    public void step2(){
        System.out.println("Step 2");
    }

    public void step3(String param1){
        System.out.println("Step 3");
    }

    public static void main(String[] args) {
        APITesting004_GET np = new APITesting004_GET();
        np.step1();
        np.step2();
        np.step3("Mansi");

        //np.step1().step2().step3("mansi");
    }
}
