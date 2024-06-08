import java.util.ArrayList;

public class builder {
    public builder(){

    }

    public customizedPc makeGamingPc(){
        customizedPc pc = new customizedPc("AMD Ryzen 7 5700X");
        pc.add(new cpu("AMD Ryzen 7 5700X", 28000), "base");
        pc.add(new motherboard("motherboard", 30000), "base");
        pc.add(new HDDdrive("HDD", 10000,"1TB"), "base");
        pc.add(new cpu_cooler("cpu cooler", 36000, "null"), "base");
        pc.add(new REST("Other components", 30000), "base");
        return pc;
    }

    public customizedPc makeCorei5Pc(){
        customizedPc pc = new customizedPc("11th generation intel processor respectively Corei5");
        pc.add(new cpu("11th generation intel processor respectively Corei5", 20000), "base");
        pc.add(new motherboard("motherboard", 30000), "base");
        pc.add(new HDDdrive("HDD", 10000,"1TB"), "base");
        pc.add(new cpu_cooler("cpu cooler", 17000, "liquid"), "base");
        pc.add(new REST("Other components", 30000), "base");
        return pc;
    }

    public customizedPc makeCorei7Pc(){
        customizedPc pc = new customizedPc("11th generation intel processor respectively Corei7");
        pc.add(new cpu("11th generation intel processor respectively Corei5", 37000), "base");
        pc.add(new motherboard("motherboard", 30000), "base");
        pc.add(new HDDdrive("HDD", 10000,"1TB"), "base");
        pc.add(new DVDdrive("DVD", 6000), "base");
        pc.add(new REST("Other components", 30000), "base");
        return pc;
    }

    public customizedPc makeCorei9Pc(){
        customizedPc pc = new customizedPc("11th generation intel processor respectively Corei9");
        pc.add(new cpu("11th generation intel processor respectively Corei5", 65000), "base");
        pc.add(new motherboard("motherboard", 30000), "base");
        pc.add(new HDDdrive("HDD", 10000,"1TB"), "base");
        pc.add(new REST("Other components", 30000), "base");
        return pc;
    }

    public customizedPc addRAM(customizedPc pc, int n){
        if(n==1){
            pc.add(new RAM("8 GB DDR4 RAM", 2620, 2666), "added");
        }
        else{
            pc.add(new RAM("8 GB DDR4 RAM", 2950, 3200), "added");
        }
        return pc;
    }

    public customizedPc addGraphicsCard(customizedPc pc, int n){
        if(n==1){
            pc.add(new graphics_card("Graphics Card", 6500, "2GB"), "added");
        }
        else{
            pc.add(new graphics_card("Graphics Card", 7600, "4GB"), "added");
        }
        return pc;
    }
}
