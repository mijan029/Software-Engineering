public class imposter {
    public imposter(){

    }
    public void action(){
        System.out.println("I am a imposter!");
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }
        new adapter().send("I am a imposter");
    }
}
