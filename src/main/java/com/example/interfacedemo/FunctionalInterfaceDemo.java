package com.example.interfacedemo;

interface RemoteControl{

    void onRemote();

}

@FunctionalInterface
interface BatteryControl{

    void getBattery();
  //  void getLight();     // Error
    /*
     Due to annotation got the error -
     Multiple non-overriding abstract methods found in interface
     */
}




public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

    }
}
