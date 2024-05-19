package net.xzh.mqtt.enums;


public enum QosEnum {
    QoS0(0),QoS1(1),QoS2(2);


    private final int value;

    QosEnum(int value) {
        this.value = value;
    }
    
    public int value(){
        return this.value;
    }
}
